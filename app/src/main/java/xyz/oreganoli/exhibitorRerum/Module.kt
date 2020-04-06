package xyz.oreganoli.exhibitorRerum

import org.koin.dsl.module
import xyz.oreganoli.exhibitorRerum.network.PostRepo
import xyz.oreganoli.exhibitorRerum.network.PostService

val appModule = module {
    single<PostRepo> { PostService(Deser()) }
}