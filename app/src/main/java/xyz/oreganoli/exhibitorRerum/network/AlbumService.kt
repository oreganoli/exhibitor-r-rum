package xyz.oreganoli.exhibitorRerum.network

import kotlinx.coroutines.Deferred;
import xyz.oreganoli.exhibitorRerum.domain.Album
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AlbumService {
    @GET("/albums")
    fun getAlbums(): Deferred<List<Album>>
    @GET("/albums")
    fun getAlbumsFromUser(@Query("userId") userId: Int): Deferred<List<Album>>
    @GET("/albums/{albumId}")
    fun getAlbum(@Path("albumId") albumId: Int): Deferred<Album>
}