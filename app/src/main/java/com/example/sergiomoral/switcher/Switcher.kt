package com.example.sergiomoral.switcher

import android.app.Application
import org.koin.android.ext.android.startKoin

class Switcher : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(myAppModules))
    }
}
