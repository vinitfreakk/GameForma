package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model


import com.google.gson.annotations.SerializedName

data class Agents_Response(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)