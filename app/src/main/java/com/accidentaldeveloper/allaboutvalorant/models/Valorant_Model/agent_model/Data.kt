package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("abilities")
    val abilities: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Ability>,
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("background")
    val background: String,
    @SerializedName("backgroundGradientColors")
    val backgroundGradientColors: List<String>,
    @SerializedName("bustPortrait")
    val bustPortrait: String,
    @SerializedName("characterTags")
    val characterTags: List<String>,
    @SerializedName("description")
    val description: String,
    @SerializedName("developerName")
    val developerName: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayIconSmall")
    val displayIconSmall: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("fullPortrait")
    val fullPortrait: String,
    @SerializedName("fullPortraitV2")
    val fullPortraitV2: String,
    @SerializedName("isAvailableForTest")
    val isAvailableForTest: Boolean,
    @SerializedName("isBaseContent")
    val isBaseContent: Boolean,
    @SerializedName("isFullPortraitRightFacing")
    val isFullPortraitRightFacing: Boolean,
    @SerializedName("isPlayableCharacter")
    val isPlayableCharacter: Boolean,
    @SerializedName("killfeedPortrait")
    val killfeedPortrait: String,
    @SerializedName("recruitmentData")
    val recruitmentData: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.RecruitmentData,
    @SerializedName("role")
    val role: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Role,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("voiceLine")
    val voiceLine: Any
)