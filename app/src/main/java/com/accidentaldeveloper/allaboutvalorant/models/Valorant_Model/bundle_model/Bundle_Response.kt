package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model


import com.google.gson.annotations.SerializedName

data class Bundle_Response(
    @SerializedName("data")
    val `data`: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model.Data>,
    @SerializedName("status")
    val status: Int
)