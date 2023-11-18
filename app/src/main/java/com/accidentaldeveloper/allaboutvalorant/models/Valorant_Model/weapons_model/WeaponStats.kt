package com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class WeaponStats(
    @SerializedName("adsStats")
    val adsStats: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.AdsStats,
    @SerializedName("airBurstStats")
    val airBurstStats: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.AirBurstStats,
    @SerializedName("altFireType")
    val altFireType: String,
    @SerializedName("altShotgunStats")
    val altShotgunStats: com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.AltShotgunStats,
    @SerializedName("damageRanges")
    val damageRanges: List<com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.DamageRange>,
    @SerializedName("equipTimeSeconds")
    val equipTimeSeconds: Double,
    @SerializedName("feature")
    val feature: String,
    @SerializedName("fireMode")
    val fireMode: String,
    @SerializedName("fireRate")
    val fireRate: Double,
    @SerializedName("firstBulletAccuracy")
    val firstBulletAccuracy: Double,
    @SerializedName("magazineSize")
    val magazineSize: Int,
    @SerializedName("reloadTimeSeconds")
    val reloadTimeSeconds: Double,
    @SerializedName("runSpeedMultiplier")
    val runSpeedMultiplier: Double,
    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Int,
    @SerializedName("wallPenetration")
    val wallPenetration: String
): Serializable