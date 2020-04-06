package xyz.oreganoli.exhibitorRerum.network

import kotlinx.coroutines.Deferred
import xyz.oreganoli.exhibitorRerum.domain.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface PostService {
    @GET("/posts")
    fun getPosts(): Deferred<List<Post>>
    @GET("/posts/{postId}")
    fun getPost(@Path("postId") postId: Int): Deferred<Post>
}