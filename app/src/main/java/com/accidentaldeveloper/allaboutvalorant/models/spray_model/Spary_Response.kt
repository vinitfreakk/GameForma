package com.accidentaldeveloper.allaboutvalorant.models.spray_model


import com.google.gson.annotations.SerializedName

data class Spary_Response(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)