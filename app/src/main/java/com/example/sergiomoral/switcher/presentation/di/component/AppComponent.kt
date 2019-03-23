package com.example.sergiomoral.switcher.presentation.di.component

import android.app.Application
import com.example.sergiomoral.switcher.presentation.di.module.ActivityModule
import com.example.sergiomoral.switcher.presentation.di.module.ApiModule
import com.example.sergiomoral.switcher.presentation.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ActivityModule::class, ApiModule::class])
interface AppComponent {

    fun app(): Application

    //fun networkDataSource(): NetworkDataSource

    //fun repository(): Repository
}
