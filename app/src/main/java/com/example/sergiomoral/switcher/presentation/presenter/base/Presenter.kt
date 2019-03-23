package com.example.sergiomoral.switcher.presentation.presenter.base

interface Presenter<V> {

    fun attachView(view: V)
}