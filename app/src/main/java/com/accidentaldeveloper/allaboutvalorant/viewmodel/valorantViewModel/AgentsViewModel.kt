package com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.repository.Valorant_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AgentsViewModel @Inject constructor(val repository: Valorant_Repository): ViewModel() {
    private val mutableAgentData = MutableLiveData<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Agents_Response>();

    val liveData:LiveData<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Agents_Response> = mutableAgentData

    init{
        getAgentData()
    }


    private fun getAgentData() = viewModelScope.launch {
         repository.getAgentsData().let{agentresponse->
          if(agentresponse.isSuccessful){
              mutableAgentData.postValue(agentresponse.body())
          }else{
              Log.d("error", "getAgentData: ${agentresponse.errorBody()}")
          }

         }
    }


}