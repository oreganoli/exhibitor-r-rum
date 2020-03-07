package xyz.oreganoli.exhibitorRerum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivity : AppCompatActivity(), KoinComponent {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val postRepo: PostRepo by inject()
        setContentView(R.layout.activity_main)
    }
}
