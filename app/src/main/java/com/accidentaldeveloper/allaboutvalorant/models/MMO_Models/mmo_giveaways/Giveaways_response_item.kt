package com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_giveaways


import com.google.gson.annotations.SerializedName

data class Giveaways_response_item(
    @SerializedName("giveaway_url")
    val giveawayUrl: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("keys_left")
    val keysLeft: String,
    @SerializedName("main_image")
    val mainImage: String,
    @SerializedName("short_description")
    val shortDescription: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String
)