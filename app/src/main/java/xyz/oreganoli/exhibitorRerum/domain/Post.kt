package xyz.oreganoli.exhibitorRerum.domain

data class Post(
    val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)