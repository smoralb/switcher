package com.example.sergiomoral.switcher.presentation.ui.splash

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.ActivityCompat
import com.example.sergiomoral.switcher.R
import com.example.sergiomoral.switcher.Switcher
import com.example.sergiomoral.switcher.Util.Constants
import com.example.sergiomoral.switcher.Util.routeToMainActivity
import com.example.sergiomoral.switcher.presentation.base.BaseActivity
import com.example.sergiomoral.switcher.presentation.presenter.splash.SplashPresenter
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashView {

    @Inject
    private lateinit var mSplashPresenter: SplashPresenter


    override fun attachViewToPresenter() {
        mSplashPresenter.attachView(this)
    }

    override fun initUI() {
        initInjector()
        checkPermissions()
    }

    override fun initInjector() {
        DaggerActivityComponent.builder()
            .appComponent(appComponent)
            .activityModule(activityModule)
            .build().inject(this)
    }

    private fun checkPermissions() {
        if (ActivityCompat.checkSelfPermission(
                this@SplashActivity,
                Manifest.permission.INTERNET
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this@SplashActivity,
                arrayOf(Manifest.permission.INTERNET),
                Constants.INTERNET_PERMISSION_CODE
            )
        } else {
            routeToMainActivity(this)
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash_screen
    }


}