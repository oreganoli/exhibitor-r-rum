package xyz.oreganoli.exhibitorRerum

import xyz.oreganoli.exhibitorRerum.domain.Post


interface PostRepo {
    /**
     * Returns the posts downloaded.
     */
    fun getAll(): List<Post>

    /**
     * Downloads posts from the API.
     */
    fun download(deser: Deser)

    /**
     * Reports if the repository is downloading data.
     */
    fun isDownloading(): Boolean
}