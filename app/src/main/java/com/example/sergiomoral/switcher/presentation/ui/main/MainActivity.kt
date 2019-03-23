package com.example.sergiomoral.switcher.presentation.ui.main

import android.support.design.widget.BottomNavigationView
import com.example.sergiomoral.switcher.R
import com.example.sergiomoral.switcher.presentation.base.BaseActivity
import com.example.sergiomoral.switcher.presentation.presenter.main.MainPresenter
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    private lateinit var mainPresenter: MainPresenter

    override fun attachViewToPresenter() {
        mainPresenter.attachView(this)
    }

    override fun initInjector() {
        DaggerActivityComponent.builder()
            .appComponent(appComponent)
            .activityModule(activityModule)
            .build().inject(this)
    }

    override fun initUI() {
        initNavigationBar()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    private fun initNavigationBar() {
        val bottonNavigationBar: BottomNavigationView = findViewById(R.id.nb_navigationBar)
    }

}