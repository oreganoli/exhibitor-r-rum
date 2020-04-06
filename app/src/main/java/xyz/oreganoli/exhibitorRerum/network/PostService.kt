package xyz.oreganoli.exhibitorRerum.network

import android.util.Log
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import xyz.oreganoli.exhibitorRerum.API_URL
import xyz.oreganoli.exhibitorRerum.Deser
import xyz.oreganoli.exhibitorRerum.domain.Post

class PostService// get data from the net on construction
    (deser: Deser) :
    PostRepo {
    var posts: List<Post> = listOf()
    var downloading = false

    init {
        download(deser)
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