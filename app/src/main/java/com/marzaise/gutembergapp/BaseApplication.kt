package com.marzaise.gutembergapp

import android.app.Application
import com.marzaise.gutembergapp.di.component.AppComponent

public class BaseApplication: Application() {
    private lateinit var appComponent: AppComponent


}