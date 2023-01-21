package com.example.geekjokes.presentation

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.geekjokes.data.repositoriy.Repository
import com.example.geekjokes.model.EventItemList
import kotlinx.coroutines.launch
import retrofit2.Response


class MainActivityViewModel : ViewModel() {
    val repository = Repository()
    var listJokes:MutableLiveData<Response<EventItemList>> = MutableLiveData()

    fun loadJoke(){
        viewModelScope.launch {
            listJokes.value = repository.getJoke()
        }
    }

    fun openLink():Intent{
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(URL_TO_GIT))
        return intent
    }
    companion object{
        private var URL_TO_GIT: String = "https://github.com/Viacheslav3016/GeekJokesTrainigApp"
    }
}