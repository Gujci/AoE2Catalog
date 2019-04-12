package com.gujci.aoe2catalog

import android.app.Application

class AoEApplication : Application() {
    lateinit var injector: AppComponent

    override fun onCreate() {
        super.onCreate()
        //injector = AppComponent.builder().build()
    }
}