package xyz.oreganoli.exhibitorRerum.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Post (
    var postId: Long = 0L,
    var username: String = "",
    var title: String = "",
    var body: String = "",
    var commentsAmount: Int = 0
)