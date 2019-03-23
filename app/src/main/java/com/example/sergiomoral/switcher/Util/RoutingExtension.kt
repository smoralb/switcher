package com.example.sergiomoral.switcher.Util

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.sergiomoral.switcher.presentation.ui.main.MainActivity

fun Activity.routeToMainActivity(context: Context) {
    val intent = Intent(context, MainActivity::class.java)
    startActivity(intent)
}