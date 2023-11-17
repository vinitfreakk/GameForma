package com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model.Spary_Response
import com.accidentaldeveloper.allaboutvalorant.repository.Valorant_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SprayViewModel @Inject constructor(val repository: Valorant_Repository):ViewModel() {
    private val mutableLiveData = MutableLiveData<Spary_Response>()
    val liveData:LiveData<Spary_Response> =  mutableLiveData
    init {
        getSprayData()
    }

    private fun getSprayData() =  viewModelScope.launch {
        repository.getSprayData().let {response->
            if(response.isSuccessful){
                mutableLiveData.postValue(response.body())
            }else{
                Log.d("error in spray_view_model", "getSprayData: ${response.errorBody()}")
            }
        }
    }


}