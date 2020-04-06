package xyz.oreganoli.exhibitorRerum.network

import kotlinx.coroutines.Deferred;
import xyz.oreganoli.exhibitorRerum.domain.Comment
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CommentService {
    @GET("/comments")
    fun getComments(): Deferred<List<Comment>>
    @GET("/comments")
    fun getCommentsFromPost(@Query("postId") postId: Int): Deferred<List<Comment>>
    @GET("/comments/{commentId}")
    fun  getComment(@Path("commentId") commentId: Int): Deferred<Comment>
}