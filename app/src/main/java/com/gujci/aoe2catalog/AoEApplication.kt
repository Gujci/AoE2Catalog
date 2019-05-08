package com.gujci.aoe2catalog

import android.app.Application
import com.gujci.aoe2catalog.network.NetworkModule

class AoEApplication : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        initDI()
    }

    private fun initDI() {
        appComponent = DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .build()
    }
}