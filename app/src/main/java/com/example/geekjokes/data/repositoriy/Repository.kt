package com.example.geekjokes.data.repositoriy

import com.example.geekjokes.data.api.ApiFactory
import com.example.geekjokes.model.EventItemList
import retrofit2.Response

class Repository {
    suspend fun getJoke ():Response<EventItemList>{
        return ApiFactory.apiService.getJokes()
    }
}