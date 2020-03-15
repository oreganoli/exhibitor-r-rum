package xyz.oreganoli.exhibitorRerum.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.oreganoli.exhibitorRerum.models.Post

@Entity
data class DatabasePost (
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

fun List<DatabasePost>.asDomainModel(): List<Post> {
    return map {
        Post (
            postId = it.postId,
            username = it.username,
            title = it.title,
            body = it.body,
            commentsAmount = it.commentsAmount
        )
    }
}