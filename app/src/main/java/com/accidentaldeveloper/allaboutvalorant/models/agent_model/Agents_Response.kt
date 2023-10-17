package com.accidentaldeveloper.allaboutvalorant.models.agent_model


import com.google.gson.annotations.SerializedName

data class Agents_Response(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)