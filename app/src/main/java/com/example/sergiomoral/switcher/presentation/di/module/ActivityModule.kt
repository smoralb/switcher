package com.example.sergiomoral.switcher.presentation.di.module

import android.app.Activity
import android.content.Context
import com.example.sergiomoral.switcher.presentation.di.qualifiers.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(activity: Activity) {

    private var mActivity: Activity = activity

    @Provides
    @PerActivity
    fun provideActivityContext(): Context = mActivity

    @Provides
    @PerActivity
    fun provideActivity(): Activity = mActivity

/*
    @Provides
    @PerActivity
    fun provideDialogManager(dialogManagerImp: DialogManagerImp): DialogManager {
        return dialogManagerImp
    }
*/
}