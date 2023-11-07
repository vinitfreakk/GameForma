package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName

data class Weapon_Response(
    @SerializedName("data")
    val `data`: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Data>,
    @SerializedName("status")
    val status: Int
)