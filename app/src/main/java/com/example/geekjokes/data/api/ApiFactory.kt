package com.example.geekjokes.data.api

import com.example.geekjokes.Companion
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(Companion.baseUrl)
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}
