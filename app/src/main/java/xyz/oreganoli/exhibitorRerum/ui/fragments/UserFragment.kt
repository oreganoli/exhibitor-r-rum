package xyz.oreganoli.exhibitorRerum.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import xyz.oreganoli.exhibitorRerum.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(activity).application
        val binding = FragmentUserBinding.inflate(inflater)

        binding.setLifecycleOwner(this)


    }
}