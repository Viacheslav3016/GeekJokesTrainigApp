package com.example.geekjokes.data.api

import com.example.geekjokes.model.EventItemList
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/activity")
    suspend fun getJokes(): Response<EventItemList>
}