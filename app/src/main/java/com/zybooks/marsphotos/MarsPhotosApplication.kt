package com.zybooks.marsphotos

import android.app.Application
import com.zybooks.marsphotos.data.AppContainer
import com.zybooks.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
