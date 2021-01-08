package com.marzaise.gutembergapp.di.module

import com.marzaise.gutembergapp.ui.library.LibraryInteractor
import com.marzaise.gutembergapp.ui.library.LibraryPresenterImpl
import com.marzaise.gutembergapp.ui.library.LibraryContract
import dagger.Module
import dagger.Provides

@Module
class LibraryModule {
    @Provides
    fun provideLibraryPresenter(interactor: LibraryInteractor): LibraryContract.Presenter {
        return LibraryPresenterImpl(
            interactor
        )
    }
}