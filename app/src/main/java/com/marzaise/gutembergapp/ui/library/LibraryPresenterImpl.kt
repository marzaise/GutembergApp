package com.marzaise.gutembergapp.ui.library

class LibraryPresenterImpl: LibraryContract.Presenter{
    private lateinit var libraryInteractor: LibraryInteractor

    constructor(interactor: LibraryInteractor) {
        libraryInteractor = interactor
    }
    override fun firstPage() {
        TODO("Not yet implemented")
    }

    override fun nextPage() {
        TODO("Not yet implemented")
    }

    override fun setView(view: LibraryContract.View) {
        TODO("Not yet implemented")
    }

    override fun searchBooks(searchText: String) {
        TODO("Not yet implemented")
    }

    override fun searchBooksBackPressed() {
        TODO("Not yet implemented")
    }

    override fun subscribe() {
        TODO("Not yet implemented")
    }

    override fun unsubscribe() {
        TODO("Not yet implemented")
    }

    override fun attach(view: LibraryContract.View) {
        TODO("Not yet implemented")
    }

}