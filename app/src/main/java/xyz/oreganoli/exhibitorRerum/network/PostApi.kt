package xyz.oreganoli.exhibitorRerum.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "http://jsonplaceholder.typicode.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

object PostApi {
    val retrofitService : PostApiService by lazy { retrofit.create(PostApiService::class.java)}
}