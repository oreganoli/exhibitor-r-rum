package xyz.oreganoli.exhibitorRerum

import android.util.Log
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

class PostService : PostRepo {
    var posts: List<Post> = listOf()
    var downloading = false

    constructor(deser: Deser) {
        download(deser) // get data from the net on construction
    }

    override fun getAll(): List<Post> {
        return posts
    }

    override fun isDownloading(): Boolean {
        return downloading
    }

    override fun download(deser: Deser) {
        downloading = true
        Log.i("POST_SERVICE", "Making a request to /posts...")
        (API_URL + "posts/")
            .httpGet()
            .responseString { request, response, result ->
                when (result) {
                    is Result.Failure -> {
                        Log.e("POST_SERVICE", "Could not fetch posts")
                        downloading = false
                        throw result.error
                    }
                    is Result.Success -> {
                        Log.i("POST_SERVICE", "Request successful!")
                        posts = deser.parseArray<Post>(result.get()) ?: posts
                        for (post in posts) {
                            Log.v(
                                "POST_SERVICE",
                                "Got post with ID ${post.id} and title \"${post.title}\""
                            )
                        }
                        downloading = false
                    }
                }
            }
    }
}