package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model


import com.google.gson.annotations.SerializedName

data class Callout(
    @SerializedName("location")
    val location: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Location,
    @SerializedName("regionName")
    val regionName: String,
    @SerializedName("superRegionName")
    val superRegionName: String
)