package com.accidentaldeveloper.allaboutvalorant.repository

import com.accidentaldeveloper.allaboutvalorant.api.ApiService
import javax.inject.Inject

class Valorant_Repository @Inject constructor(val apiService: ApiService) {

    suspend fun getAgentsData() = apiService.getAgents()

    suspend fun getWeaponsData() = apiService.getWeapons()

    suspend fun getMapsData() = apiService.getMaps()

    suspend fun getSprayData() = apiService.getSpray()

    suspend fun getBundlesData() = apiService.getBundels()

}