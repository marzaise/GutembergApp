package com.marzaise.gutembergapp.ui

import androidx.appcompat.app.AppCompatActivity
import com.marzaise.gutembergapp.ui.base.BaseContract

abstract class BaseActivity: AppCompatActivity(), BaseContract.View {
    protected lateinit var presenter: BaseContract.Presenter<*>

}