package xyz.oreganoli.exhibitorRerum.network

import kotlinx.coroutines.Deferred
import xyz.oreganoli.exhibitorRerum.domain.User
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("/users")
    fun getUsers(): Deferred<List<User>>
    @GET("/users/{userId}")
    fun getUser(@Path("userId") userId : Int): Deferred<User>
}