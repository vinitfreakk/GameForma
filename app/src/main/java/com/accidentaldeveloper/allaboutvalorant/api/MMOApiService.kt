package com.accidentaldeveloper.allaboutvalorant.api

import com.accidentaldeveloper.allaboutvalorant.helper.AppConstant
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response_item
import retrofit2.Response
import retrofit2.http.GET


interface MMOApiService {
    @GET(AppConstant.MMO_BASE_URL)
    suspend fun getNewsFeed(): Response<News_response>

}