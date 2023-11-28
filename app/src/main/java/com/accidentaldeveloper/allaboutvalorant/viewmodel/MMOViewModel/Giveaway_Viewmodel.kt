package com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.api.MMOApiService
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.Games.Game_Response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_giveaways.Giveaways_response
import com.accidentaldeveloper.allaboutvalorant.repository.MMO_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Giveaway_Viewmodel @Inject constructor(private val mmoRepository: MMO_Repository):ViewModel() {
    private val mutableLiveData = MutableLiveData<Giveaways_response>()
    val liveData:LiveData<Giveaways_response> = mutableLiveData


    init {
        getGiveAways()
    }

     fun getGiveAways() = viewModelScope.launch {
         try {
             mmoRepository.getGiveAway()?.let { response ->
                 if (response.isSuccessful) {
                     mutableLiveData.postValue(response.body())
                 }
             }
         } catch (e: Exception) {
             Log.e("error in news viewmodel", "getGiveAway: ${e.message}")
         }
     }
    }


