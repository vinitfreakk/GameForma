package com.accidentaldeveloper.allaboutvalorant.models.spray_model


import com.google.gson.annotations.SerializedName

data class Level(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("sprayLevel")
    val sprayLevel: Int,
    @SerializedName("uuid")
    val uuid: String
)