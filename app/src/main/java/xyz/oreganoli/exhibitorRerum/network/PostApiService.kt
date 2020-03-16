package xyz.oreganoli.exhibitorRerum.network

import androidx.room.Query
import retrofit2.http.GET
import xyz.oreganoli.exhibitorRerum.domain.Post

interface PostApiService {
    @GET("/posts")
    suspend fun getPosts(type: String):
            List<Post>
}