package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Data(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("defaultSkinUuid")
    val defaultSkinUuid: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("killStreamIcon")
    val killStreamIcon: String,
    @SerializedName("shopData")
    val shopData: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.ShopData,
    @SerializedName("skins")
    val skins: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Skin>,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("weaponStats")
    val weaponStats: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.WeaponStats
):Serializable