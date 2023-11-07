package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName

data class GridPosition(
    @SerializedName("column")
    val column: Int,
    @SerializedName("row")
    val row: Int
)