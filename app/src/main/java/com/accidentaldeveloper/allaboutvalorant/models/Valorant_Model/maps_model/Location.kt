package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)