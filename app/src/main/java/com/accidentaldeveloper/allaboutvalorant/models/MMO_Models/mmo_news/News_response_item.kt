package com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news


import com.google.gson.annotations.SerializedName

data class News_response_item(
    @SerializedName("article_content")
    val articleContent: String,
    @SerializedName("article_url")
    val articleUrl: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("main_image")
    val mainImage: String,
    @SerializedName("short_description")
    val shortDescription: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String
)