package xyz.oreganoli.exhibitorRerum.viewmodels.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import xyz.oreganoli.exhibitorRerum.viewmodels.PostsViewModel
import java.lang.IllegalArgumentException

class PostsViewModelFactory(val app: Application) : ViewModelProvider.Factory {
    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(PostsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PostsViewModel(app) as T
        }
        throw IllegalArgumentException("Unable to construct viewmodel")
    }
}