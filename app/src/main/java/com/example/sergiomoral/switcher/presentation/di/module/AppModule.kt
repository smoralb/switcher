package com.example.sergiomoral.switcher.presentation.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    private lateinit var mApplication: Application


    fun AppModule(application: Application) {
        this.mApplication = application
    }

    @Provides
    @Singleton
    fun provideApplicationContext(): Application {
        return mApplication
    }
}