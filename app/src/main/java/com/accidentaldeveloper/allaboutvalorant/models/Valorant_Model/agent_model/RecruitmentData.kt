package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model


import com.google.gson.annotations.SerializedName

data class RecruitmentData(
    @SerializedName("counterId")
    val counterId: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("levelVpCostOverride")
    val levelVpCostOverride: Int,
    @SerializedName("milestoneId")
    val milestoneId: String,
    @SerializedName("milestoneThreshold")
    val milestoneThreshold: Int,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("useLevelVpCostOverride")
    val useLevelVpCostOverride: Boolean
)