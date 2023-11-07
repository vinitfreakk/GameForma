package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("animationGif")
    val animationGif: String,
    @SerializedName("animationPng")
    val animationPng: String,
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("fullIcon")
    val fullIcon: String,
    @SerializedName("fullTransparentIcon")
    val fullTransparentIcon: String,
    @SerializedName("hideIfNotOwned")
    val hideIfNotOwned: Boolean,
    @SerializedName("isNullSpray")
    val isNullSpray: Boolean,
    @SerializedName("levels")
    val levels: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model.Level>,
    @SerializedName("themeUuid")
    val themeUuid: String,
    @SerializedName("uuid")
    val uuid: String
)