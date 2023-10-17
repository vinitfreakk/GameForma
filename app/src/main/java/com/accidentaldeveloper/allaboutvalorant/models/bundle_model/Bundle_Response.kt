package com.accidentaldeveloper.allaboutvalorant.models.bundle_model


import com.google.gson.annotations.SerializedName

data class Bundle_Response(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)