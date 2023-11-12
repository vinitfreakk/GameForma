package com.accidentaldeveloper.allaboutvalorant.models.adapterModel

import java.io.Serializable

data class AgentsAdapterModel(
    val agentName:String,
    val agentImg: Int,
    val agentType:String,
   /* val bgColor:Int*/
): Serializable
