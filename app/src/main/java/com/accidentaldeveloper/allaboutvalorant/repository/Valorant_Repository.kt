package com.accidentaldeveloper.allaboutvalorant.repository

import com.accidentaldeveloper.allaboutvalorant.api.ValorantApiService
import javax.inject.Inject

class Valorant_Repository @Inject constructor(val apiService: ValorantApiService) {

    suspend fun getAgentsData() = apiService.getAgents()

    suspend fun getWeaponsData() = apiService.getWeapons()

    suspend fun getMapsData() = apiService.getMaps()

    suspend fun getSprayData() = apiService.getSpray()

    suspend fun getBundlesData() = apiService.getBundels()

}