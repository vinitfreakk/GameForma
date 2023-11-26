package com.accidentaldeveloper.allaboutvalorant.repository

import com.accidentaldeveloper.allaboutvalorant.api.MMOApiService
import com.accidentaldeveloper.allaboutvalorant.api.ValorantApiService
import javax.inject.Inject

class MMO_Repository @Inject constructor (private val apiService: MMOApiService) {
    suspend fun getNewsFeed() = apiService.getNewsFeed()
}