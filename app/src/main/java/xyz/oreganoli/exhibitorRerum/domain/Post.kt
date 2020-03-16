package xyz.oreganoli.exhibitorRerum.domain

data class Post (
    var id: Int = 0,
    var userId: Int = 0,
    var title: String = "",
    var body: String = ""
)