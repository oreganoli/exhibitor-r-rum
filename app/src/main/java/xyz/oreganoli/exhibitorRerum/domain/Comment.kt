package xyz.oreganoli.exhibitorRerum.domain

data class Comment (
    var postId: Int = 0,
    var id: Int = 0,
    var name: String = "",
    var email: String = "",
    var body: String = ""
)