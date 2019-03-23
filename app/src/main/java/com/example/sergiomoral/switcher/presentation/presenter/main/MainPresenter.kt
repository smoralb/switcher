package com.example.sergiomoral.switcher.presentation.presenter.main

import com.example.sergiomoral.switcher.presentation.presenter.base.Presenter
import com.example.sergiomoral.switcher.presentation.ui.main.MainView

class MainPresenter: Presenter<MainView> {

    private lateinit var mainView: MainView

    override fun attachView(view: MainView) {
        mainView = view
    }
}