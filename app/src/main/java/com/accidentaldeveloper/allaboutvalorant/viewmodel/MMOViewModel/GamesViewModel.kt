package com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.Games.Game_Response
import com.accidentaldeveloper.allaboutvalorant.repository.MMO_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel @Inject constructor(private val repository: MMO_Repository):ViewModel() {
    private val mutableLiveData = MutableLiveData<Game_Response>()

    val liveData: LiveData<Game_Response> = mutableLiveData

    init {
        getGames()
    }

    fun getGames() = viewModelScope.launch {
        try {
            repository.getGames()?.let { response ->
                if (response.isSuccessful) {
                    mutableLiveData.postValue(response.body())
                }
            }
        } catch (e: Exception) {
            Log.e("error in games viewmodel", "getgames: ${e.message}")
        }
    }

}