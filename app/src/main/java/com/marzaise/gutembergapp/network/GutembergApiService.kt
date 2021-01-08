package com.marzaise.gutembergapp.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface GutembergApiService {

    @GET("")
    fun getLibrary(@Query("page") page: Int): Observable<String>
}