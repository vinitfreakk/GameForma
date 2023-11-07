package com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_categories_games


import com.google.gson.annotations.SerializedName

data class categories_game_responseItem(
    @SerializedName("developer")
    val developer: String,
    @SerializedName("game_url")
    val gameUrl: String,
    @SerializedName("genre")
    val genre: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("platform")
    val platform: String,
    @SerializedName("profile_url")
    val profileUrl: String,
    @SerializedName("publisher")
    val publisher: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("short_description")
    val shortDescription: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String
)