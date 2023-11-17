package com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Weapon_Response
import com.accidentaldeveloper.allaboutvalorant.repository.Valorant_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeaponsViewModel @Inject constructor(private val repository: Valorant_Repository):ViewModel() {
    private val mutableLiveData = MutableLiveData<Weapon_Response>()
    val liveData:LiveData<Weapon_Response> = mutableLiveData

    init {
        getWeaponsData()
    }

    private fun getWeaponsData() = viewModelScope.launch {
        repository.getWeaponsData().let {response->
            if(response.isSuccessful){
                mutableLiveData.postValue(response.body())
            }else{
                Log.d("error_in_weapons_viewModel", "getWeaponsData: ${response.errorBody()}")
            }
        }
    }


}