package com.accidentaldeveloper.allaboutvalorant.models.maps_model


import com.google.gson.annotations.SerializedName

data class Maps_Response(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)