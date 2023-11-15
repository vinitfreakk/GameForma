package com.accidentaldeveloper.allaboutvalorant.api

import com.accidentaldeveloper.allaboutvalorant.helper.AppConstant
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Agents_Response
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model.Bundle_Response
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Maps_Response
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model.Spary_Response
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Weapon_Response
import retrofit2.Response
import retrofit2.http.GET

interface ValorantApiService {

    @GET(AppConstant.AGENT_END_POINT)
    suspend fun getAgents():Response<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Agents_Response>

    @GET(AppConstant.BUNDLES_END_POINT)
    suspend fun getBundels():Response<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model.Bundle_Response>

    @GET(AppConstant.MAPS_END_POINT)
    suspend fun getMaps():Response<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Maps_Response>

    @GET(AppConstant.WEAPONS_END_POINT)
    suspend fun getWeapons():Response<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Weapon_Response>

    @GET(AppConstant.SPRAY_END_POINT)
    suspend fun getSpray():Response<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model.Spary_Response>



}