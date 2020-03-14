package xyz.oreganoli.exhibitorRerum.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xyz.oreganoli.exhibitorRerum.R

class ExhibitionActivity : AppCompatActivity() {
    /**
     * Called when the activity is starting.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exhibition)
    }
}