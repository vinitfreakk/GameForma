package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model


import com.google.gson.annotations.SerializedName

data class Spary_Response(
    @SerializedName("data")
    val `data`: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model.Data>,
    @SerializedName("status")
    val status: Int
)