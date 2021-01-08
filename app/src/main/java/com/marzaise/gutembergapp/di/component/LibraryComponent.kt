package com.marzaise.gutembergapp.di.component

import com.marzaise.gutembergapp.di.module.LibraryModule
import com.marzaise.gutembergapp.di.scopes.LibraryScope
import dagger.Subcomponent

@LibraryScope
@Subcomponent(
    modules = arrayOf(
        LibraryModule::class
    )
)
interface LibraryComponent{

}