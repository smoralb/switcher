package com.example.sergiomoral.switcher.presentation.di.component

import android.app.Application
import android.content.Context
import com.example.sergiomoral.switcher.presentation.di.module.ActivityModule
import com.example.sergiomoral.switcher.presentation.di.qualifiers.PerActivity
import com.example.sergiomoral.switcher.presentation.ui.main.MainActivity
import com.example.sergiomoral.switcher.presentation.ui.splash.SplashActivity
import dagger.Component

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(app: Application)

    fun inject(context: Context)

    fun inject(splashActivity: SplashActivity)

    fun inject(mainActivity: MainActivity)
}