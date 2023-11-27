package com.accidentaldeveloper.allaboutvalorant.repository

import com.accidentaldeveloper.allaboutvalorant.api.MMOApiService
import com.accidentaldeveloper.allaboutvalorant.api.ValorantApiService
import com.accidentaldeveloper.allaboutvalorant.helper.ApiAnnotation
import javax.inject.Inject
import javax.inject.Named

class MMO_Repository @Inject constructor (@ApiAnnotation private val apiService: MMOApiService) {
    suspend fun getNewsFeed() = apiService.getNewsFeed()
}