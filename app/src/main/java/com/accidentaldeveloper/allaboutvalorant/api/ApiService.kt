package com.accidentaldeveloper.allaboutvalorant.api

import com.accidentaldeveloper.allaboutvalorant.helper.AppConstant
import com.accidentaldeveloper.allaboutvalorant.models.agent_model.Agents_Response
import com.accidentaldeveloper.allaboutvalorant.models.bundle_model.Bundle_Response
import com.accidentaldeveloper.allaboutvalorant.models.maps_model.Maps_Response
import com.accidentaldeveloper.allaboutvalorant.models.spray_model.Spary_Response
import com.accidentaldeveloper.allaboutvalorant.models.weapons_model.Weapon_Response
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET(AppConstant.AGENT_END_POINT)
    suspend fun getAgents():Call<Agents_Response>

    @GET(AppConstant.BUNDLES_END_POINT)
    suspend fun getBundels():Call<Bundle_Response>

    @GET(AppConstant.AGENT_END_POINT)
    suspend fun getMaps():Call<Maps_Response>

    @GET(AppConstant.WEAPONS_END_POINT)
    suspend fun getWeapons():Call<Weapon_Response>

    @GET(AppConstant.SPRAY_END_POINT)
    suspend fun getSpray():Call<Spary_Response>



}