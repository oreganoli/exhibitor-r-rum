package xyz.oreganoli.exhibitorRerum.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PostsViewModel : ViewModel() {
    private val _username = MutableLiveData<>
    val username: LiveData<>
        get() = _username

    private val _title = MutableLiveData<>
    val title: LiveData<>
        get() = _title

    private val _body = MutableLiveData<>
    val title: LiveData<>
        get() = _body

    private val _comments = MutableLiveData<>
    val comments: LiveData<>
        get() = _comments

    val commentsAmmo
}