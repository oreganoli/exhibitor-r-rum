package xyz.oreganoli.exhibitorRerum.viewmodels

import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import xyz.oreganoli.exhibitorRerum.database.getDatabase
import xyz.oreganoli.exhibitorRerum.repository.PostsRepository

class PostsViewModel(application Application) : AndroidViewModel(application) {

    // Needed for cancel all coroutines
    private var viewModelJob = SupervisorJob()

    private val viewModelScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private val database = getDatabase(application)
    private val postsRepository = PostsRepository(database)

    init {
        viewModelScope.launch {
            postsRepository.refreshPosts()
        }
    }

    val posts = postsRepository.posts

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}