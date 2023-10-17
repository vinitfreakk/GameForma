package com.accidentaldeveloper.allaboutvalorant.models.agent_model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("abilities")
    val abilities: List<Ability>,
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
    val recruitmentData: RecruitmentData,
    @SerializedName("role")
    val role: Role,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("voiceLine")
    val voiceLine: Any
)