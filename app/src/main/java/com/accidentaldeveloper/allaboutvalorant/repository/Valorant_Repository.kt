package com.accidentaldeveloper.allaboutvalorant.repository

import com.accidentaldeveloper.allaboutvalorant.api.ValorantApiService
import com.accidentaldeveloper.allaboutvalorant.helper.ApiAnnotation
import javax.inject.Inject
import javax.inject.Named

class Valorant_Repository @Inject constructor(@ApiAnnotation val apiService: ValorantApiService) {

    suspend fun getAgentsData() = apiService.getAgents()

    suspend fun getWeaponsData() = apiService.getWeapons()

    suspend fun getMapsData() = apiService.getMaps()

    suspend fun getSprayData() = apiService.getSpray()

    suspend fun getBundlesData() = apiService.getBundels()

}