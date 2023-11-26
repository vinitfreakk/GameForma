package com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response_item
import com.accidentaldeveloper.allaboutvalorant.repository.MMO_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class News_ViewModel @Inject constructor(private val repository: MMO_Repository):ViewModel() {
    val mutableLiveData = MutableLiveData<News_response> ()
    val liveData: LiveData<News_response> = mutableLiveData

    init {
        getNewsFeed()
    }

    fun getNewsFeed() = viewModelScope.launch {
        try {
            repository.getNewsFeed()?.let { response ->
                if (response.isSuccessful) {
                    mutableLiveData.postValue(response.body())
                }
            }
        } catch (e: Exception) {
            Log.e("error in news viewmodel", "getNewsFeed: ${e.message}")
        }
    }
}