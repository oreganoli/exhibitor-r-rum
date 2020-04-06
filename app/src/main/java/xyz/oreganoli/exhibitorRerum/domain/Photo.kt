package xyz.oreganoli.exhibitorRerum.domain

data class Photo (
    var albumId: Int = 0,
    var id: Int = 0,
    var title: String = "",
    var url: String = "",
    var thumbnailUrl: String = ""
)