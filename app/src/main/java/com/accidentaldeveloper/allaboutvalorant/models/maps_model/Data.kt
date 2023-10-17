package com.accidentaldeveloper.allaboutvalorant.models.maps_model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("callouts")
    val callouts: List<Callout>,
    @SerializedName("coordinates")
    val coordinates: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("listViewIcon")
    val listViewIcon: String,
    @SerializedName("mapUrl")
    val mapUrl: String,
    @SerializedName("narrativeDescription")
    val narrativeDescription: String,
    @SerializedName("splash")
    val splash: String,
    @SerializedName("tacticalDescription")
    val tacticalDescription: String,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("xMultiplier")
    val xMultiplier: Double,
    @SerializedName("xScalarToAdd")
    val xScalarToAdd: Double,
    @SerializedName("yMultiplier")
    val yMultiplier: Double,
    @SerializedName("yScalarToAdd")
    val yScalarToAdd: Double
)