package xyz.oreganoli.exhibitorRerum

import org.koin.dsl.module

val appModule = module {
    single<PostRepo> { PostService(Deser()) }
}