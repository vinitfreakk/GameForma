package com.accidentaldeveloper.allaboutvalorant.models.weapons_model


import com.google.gson.annotations.SerializedName

data class AltShotgunStats(
    @SerializedName("burstRate")
    val burstRate: Double,
    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Int
)