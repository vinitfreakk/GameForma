package com.accidentaldeveloper.allaboutvalorant.models.bundle_model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayIcon2")
    val displayIcon2: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("displayNameSubText")
    val displayNameSubText: String,
    @SerializedName("extraDescription")
    val extraDescription: String,
    @SerializedName("promoDescription")
    val promoDescription: String,
    @SerializedName("useAdditionalContext")
    val useAdditionalContext: Boolean,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("verticalPromoImage")
    val verticalPromoImage: String
)