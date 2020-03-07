package xyz.oreganoli.exhibitorRerum

import android.app.Application
import android.util.Log
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ExhibApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("EXHIBITOR", "Starting app")
        startKoin {
            androidLogger()
            androidContext(this@ExhibApp)
            modules(appModule)
        }
    }

    override fun onTerminate() {
        Log.i("EXHIBITOR", "App terminated")
        super.onTerminate()
    }
}