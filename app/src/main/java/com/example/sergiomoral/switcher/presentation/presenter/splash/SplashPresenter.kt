package com.example.sergiomoral.switcher.presentation.presenter.splash

import com.example.sergiomoral.switcher.presentation.presenter.base.Presenter
import com.example.sergiomoral.switcher.presentation.ui.splash.SplashView

class SplashPresenter: Presenter<SplashView> {

    private lateinit var splashView: SplashView

    override fun attachView(view: SplashView) {
        splashView = view
    }
}