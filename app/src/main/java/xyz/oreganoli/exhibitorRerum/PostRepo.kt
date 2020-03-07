package xyz.oreganoli.exhibitorRerum

interface PostRepo {
    fun getAll(): List<Post>
    fun refresh()
}