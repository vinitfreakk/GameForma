package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName

data class Skin(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("chromas")
    val chromas: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Chroma>,
    @SerializedName("contentTierUuid")
    val contentTierUuid: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("levels")
    val levels: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Level>,
    @SerializedName("themeUuid")
    val themeUuid: String,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("wallpaper")
    val wallpaper: String
)