package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ShopData(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("canBeTrashed")
    val canBeTrashed: Boolean,
    @SerializedName("category")
    val category: String,
    @SerializedName("categoryText")
    val categoryText: String,
    @SerializedName("cost")
    val cost: Int,
    @SerializedName("gridPosition")
    val gridPosition: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.GridPosition,
    @SerializedName("image")
    val image: Any,
    @SerializedName("newImage")
    val newImage: String,
    @SerializedName("newImage2")
    val newImage2: Any
): Serializable