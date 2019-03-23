package com.example.sergiomoral.switcher.presentation.base;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.example.sergiomoral.switcher.Switcher;
import com.example.sergiomoral.switcher.presentation.di.component.AppComponent;
import com.example.sergiomoral.switcher.presentation.di.module.ActivityModule;

public abstract class BaseActivity extends Activity implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        int layoutId = getLayoutId();
        if (layoutId != 0) {
            setContentView(layoutId);
        }
        initInjector();
        attachViewToPresenter();
        initUI();
    }

    @Override
    public void showLoading() {
        //mDialogManager.showLoading();
    }

    @Override
    public void hideLoading() {
        //mDialogManager.hideLoading();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected AppComponent getAppComponent() {
        return ((Switcher) getApplication()).getAppComponent();
    }


    protected abstract void attachViewToPresenter();

    protected abstract void initInjector();

    protected abstract void initUI();

    public abstract int getLayoutId();
}
