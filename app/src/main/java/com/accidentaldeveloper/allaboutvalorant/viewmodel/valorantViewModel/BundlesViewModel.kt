package com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model.Bundle_Response
import com.accidentaldeveloper.allaboutvalorant.repository.Valorant_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BundlesViewModel @Inject constructor(val repository: Valorant_Repository) : ViewModel() {

    val mutableLiveData = MutableLiveData<Bundle_Response>()
    val livedata: LiveData<Bundle_Response> = mutableLiveData

    init {
        getBundleData()
    }

    private fun getBundleData() = viewModelScope.launch {
        repository.getBundlesData().let { response ->
            if (response.isSuccessful) {
                mutableLiveData.postValue(response.body())
            } else {
                Log.d("error in bundle repository", "getBundleData: ${response.errorBody()}")
            }

        }
    }


}