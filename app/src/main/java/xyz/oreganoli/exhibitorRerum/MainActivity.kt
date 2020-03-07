package xyz.oreganoli.exhibitorRerum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.koin.core.KoinComponent
import org.koin.core.inject
import xyz.oreganoli.exhibitorRerum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), KoinComponent {
    private var page = 1
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("CURRENT_POST_PAGE")) {
                page = savedInstanceState.getInt("CURRENT_POST_PAGE")
            }
        }
        val postRepo: PostRepo by inject()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVariable(BR.page, page.toString())
        binding.executePendingBindings()
    }
}
