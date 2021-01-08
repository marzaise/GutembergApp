package com.marzaise.gutembergapp.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by ivan on 8/20/2017.
 */
@Singleton
class RequestInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        /*
        val originalHttpUrl = original.url()
        val url = originalHttpUrl.newBuilder()
            .addQueryParameter("api_key", "4c787e0512a9157dac09f34837e406f5")
            .build()
         */
        val request = original.newBuilder()/*.url(url)*/.build()
        return chain.proceed(request)
    }
}
