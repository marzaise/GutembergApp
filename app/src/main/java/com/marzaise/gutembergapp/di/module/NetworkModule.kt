package com.marzaise.gutembergapp.di.module

import com.marzaise.gutembergapp.BuildConfig
import com.marzaise.gutembergapp.network.GutembergApiService
import com.marzaise.gutembergapp.network.RequestInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {
    val CONNECT_TIMEOUT_IN_MS = 30000

    @Provides
    @Singleton
    fun requestInterceptor(interceptor: RequestInterceptor): Interceptor? {
        return interceptor
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(requestInterceptor: RequestInterceptor): OkHttpClient? {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(
            CONNECT_TIMEOUT_IN_MS.toLong(),
            TimeUnit.MILLISECONDS
        )
            .addInterceptor(requestInterceptor)
        if (false) {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            builder.addInterceptor(loggingInterceptor)
        }
        return builder.build()
    }

    @Singleton
    @Provides
    fun retrofit(okHttpClient: OkHttpClient?): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.GUTEMBERG_BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun GutembergApiService(retrofit: Retrofit): GutembergApiService? {
        return retrofit.create(GutembergApiService::class.java)
    }
}