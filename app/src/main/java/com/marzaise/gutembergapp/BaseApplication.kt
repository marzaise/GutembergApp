package com.marzaise.gutembergapp

import android.app.Application
import com.marzaise.gutembergapp.di.component.AppComponent
import com.marzaise.gutembergapp.di.component.LibraryComponent

abstract class BaseApplication: Application() {
    private lateinit var appComponent: AppComponent

    private lateinit var libraryComponent: LibraryComponent

    protected abstract fun initializeDagger()

    protected abstract fun initializePresenter()

    override fun onCreate() {
        super.onCreate()
        //appComponent = createAppComponent()
    }

    /*
    private fun createAppComponent() : AppComponent{
        //return DaggerAppComponent.builder()
        //.appModule(AppModule(this)).build()
    }
     */


}