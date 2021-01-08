package com.marzaise.gutembergapp.ui.library

import com.marzaise.gutembergapp.model.Book
import com.marzaise.gutembergapp.ui.base.BaseContract

class LibraryContract {
    interface View: BaseContract.View {
        fun showBooks(books: List<Book>)
        fun loadingStarted()
        fun loadingFailed(errorMessage: String)
        fun onBookClicked(id: String)
    }

    interface Presenter: BaseContract.Presenter<LibraryContract.View> {
        fun firstPage()
        fun nextPage()
        fun setView(view: LibraryContract.View)
        fun searchBooks(searchText: String)
        fun searchBooksBackPressed()
    }
}