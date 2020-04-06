package xyz.oreganoli.exhibitorRerum.network

import kotlinx.coroutines.Deferred;
import xyz.oreganoli.exhibitorRerum.domain.Photo
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PhotoService {
    @GET("/photos")
    fun getAlbums(): Deferred<List<Photo>>
    @GET("/photos")
    fun getPhotosFromAlbum(@Query("albumId") albumId: Int): Deferred<List<Photo>>
    @GET("/albums/{albumId}")
    fun getPhoto(@Path("photoId") photoId: Int): Deferred<Photo>
}