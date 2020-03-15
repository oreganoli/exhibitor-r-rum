package xyz.oreganoli.exhibitorRerum.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import xyz.oreganoli.exhibitorRerum.database.PostsDatabase
import xyz.oreganoli.exhibitorRerum.database.asDomainModel
import xyz.oreganoli.exhibitorRerum.models.Post

class PostsRepository(private val database: PostsDatabase) {
    val posts: LiveData<List<Post>> = Transformations.map(database.postDao.getPosts()) {
        it.asDomainModel()
    }

    suspend fun refreshPosts() {
        withContext(Dispatchers.IO) {
            //val postList = Network.posts.getPosts()
            //database.postDao.insertAll(*postList.asDatabaseModel())
        }
    }
}