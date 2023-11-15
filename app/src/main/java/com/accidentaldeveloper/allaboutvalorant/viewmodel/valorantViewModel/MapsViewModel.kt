package com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Maps_Response
import com.accidentaldeveloper.allaboutvalorant.repository.Valorant_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(val repository: Valorant_Repository):ViewModel() {
    private val mutableLiveData = MutableLiveData<Maps_Response>()

    val liveData:LiveData<Maps_Response> = mutableLiveData

    init {
        getMapsData()
    }

    fun getMapsData() = viewModelScope.launch {
        repository.getMapsData().let {response ->
            if(response.isSuccessful){
                mutableLiveData.postValue(response.body())
            }else{
                Log.d("error in maps viewmodel", "getMapsData: ${response.errorBody()}")
            }

        }
    }
}