package com.accidentaldeveloper.allaboutvalorant.models.weapons_model


import com.google.gson.annotations.SerializedName

data class Weapon_Response(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)