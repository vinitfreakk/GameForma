package com.accidentaldeveloper.allaboutvalorant.api

import com.accidentaldeveloper.allaboutvalorant.helper.AppConstant
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.Games.Game_Response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_giveaways.Giveaways_response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response_item
import retrofit2.Response
import retrofit2.http.GET


interface MMOApiService {
    @GET(AppConstant.NEWS_END_POINTS)
    suspend fun getNewsFeed(): Response<News_response>

    @GET(AppConstant.GAMES_END_POINTS)
    suspend fun getGamesFeed(): Response<Game_Response>

    @GET(AppConstant.GIVEAWYS_END_POINTS)
    suspend fun getGiveAwayFeed(): Response<Giveaways_response>

}