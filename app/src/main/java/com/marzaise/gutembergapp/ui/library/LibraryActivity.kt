package com.marzaise.gutembergapp.ui.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marzaise.gutembergapp.databinding.ActivityLibraryBinding
import com.marzaise.gutembergapp.model.Book
import javax.inject.Inject

class LibraryActivity : AppCompatActivity(), LibraryContract.View {
    @Inject
    lateinit var presenter: LibraryContract.Presenter

    private lateinit var binding: ActivityLibraryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun showBooks(books: List<Book>) {
        TODO("Not yet implemented")
    }

    override fun loadingStarted() {
        TODO("Not yet implemented")
    }

    override fun loadingFailed(errorMessage: String) {
        TODO("Not yet implemented")
    }

    override fun onBookClicked(id: String) {
        TODO("Not yet implemented")
    }
}