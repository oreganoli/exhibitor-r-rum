package xyz.oreganoli.exhibitorRerum.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import xyz.oreganoli.exhibitorRerum.R
import xyz.oreganoli.exhibitorRerum.adapters.PostAdapter
import xyz.oreganoli.exhibitorRerum.viewmodels.PostsViewModel
import xyz.oreganoli.exhibitorRerum.viewmodels.factories.PostsViewModelFactory

class PostsFragment : Fragment() {
    private val viewModel: PostsViewModel by lazy {
        val activity = requireNotNull(this.activity) {

        }
        ViewModelProvider(this, PostsViewModelFactory(activity.application))
            .get(PostsViewModel::class.java)
    }

    private var viewModelAdapter: PostAdapter? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPostsBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_posts,
            container,
            false)
        binding.lifecycleOwner = viewLifecycleOwner

        binding.viewModel = viewModel

        binding.post.adapter = viewModelAdapter
    }
}