package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model


import com.google.gson.annotations.SerializedName

data class Maps_Response(
    @SerializedName("data")
    val `data`: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Data>,
    @SerializedName("status")
    val status: Int
)