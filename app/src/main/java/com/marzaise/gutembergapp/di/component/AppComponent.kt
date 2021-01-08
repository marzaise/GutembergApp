package com.marzaise.gutembergapp.di.component

import com.marzaise.gutembergapp.di.module.LibraryModule
import com.marzaise.gutembergapp.di.module.NetworkModule
import com.marzaise.gutembergapp.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {
    operator fun plus(listingModule: LibraryModule): LibraryComponent
}