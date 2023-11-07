package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName

data class AirBurstStats(
    @SerializedName("burstDistance")
    val burstDistance: Double,
    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Int
)