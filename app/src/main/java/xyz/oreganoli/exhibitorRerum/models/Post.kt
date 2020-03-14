package xyz.oreganoli.exhibitorRerum.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts_table")
data class Post (
    @PrimaryKey(autoGenerate = true)
    var postId: Long = 0L,

    @ColumnInfo(name = "username")
    var username: String = "",

    @ColumnInfo(name = "title")
    var title: String = "",

    @ColumnInfo(name = "body")
    var body: String = "",

    @ColumnInfo(name = "comments")
    var commentsAmount: Int = 0
)