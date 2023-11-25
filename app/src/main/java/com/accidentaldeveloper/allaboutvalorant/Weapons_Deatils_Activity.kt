package com.accidentaldeveloper.allaboutvalorant


import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.accidentaldeveloper.allaboutvalorant.adapters.SkinsAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityWeaponsDeatilsBinding
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Data
import com.bumptech.glide.Glide


class Weapons_Deatils_Activity : AppCompatActivity() {
    lateinit var binding: ActivityWeaponsDeatilsBinding


    @SuppressLint("UnsafeOptInUsageError")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeaponsDeatilsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val receivedWeaponIndex = intent.getSerializableExtra("data") as? Data
        Glide.with(this@Weapons_Deatils_Activity).load(receivedWeaponIndex!!.displayIcon)
            .into(binding.weapon)
        binding.weaponName.text = receivedWeaponIndex.displayName

        Log.d("agentIndex", "onCreate: ${receivedWeaponIndex}")


        val skin_rv = binding.skinsRv
        skin_rv.adapter = SkinsAdapter(receivedWeaponIndex.skins)
        skin_rv.set3DItem(true)
        skin_rv.setInfinite(true)
        skin_rv.setAlpha(true)

        val carouselLayoutManager = skin_rv.getCarouselLayoutManager()
        val currentlyCenterPosition = skin_rv.getSelectedPosition()

        binding.Category.text = receivedWeaponIndex.category ?: "null"
        binding.firerate.text = receivedWeaponIndex?.weaponStats?.fireRate?.toString() ?: "null"
        binding.magzineSize.text = receivedWeaponIndex?.weaponStats?.magazineSize?.toString() ?: "null"
        binding.runspeedmultiplier.text = receivedWeaponIndex?.weaponStats?.runSpeedMultiplier?.toString() ?: "null"
        binding.equipTimeSeconds.text = receivedWeaponIndex?.weaponStats?.equipTimeSeconds?.toString() ?: "null"
        binding.reloadTimeSeconds.text = receivedWeaponIndex?.weaponStats?.reloadTimeSeconds?.toString() ?: "null"
        binding.firstBulletAccuracy.text = receivedWeaponIndex?.weaponStats?.firstBulletAccuracy?.toString() ?: "null"
        binding.shotgunPelletCount.text = receivedWeaponIndex?.weaponStats?.shotgunPelletCount?.toString() ?: "null"
        binding.wallPenetration.text = receivedWeaponIndex?.weaponStats?.wallPenetration?.toString() ?: "null"
        binding.fireMode.text = receivedWeaponIndex?.weaponStats?.fireMode?.toString() ?: "null"
        binding.altFireType.text = receivedWeaponIndex?.weaponStats?.altFireType?.toString() ?: "null"
        binding.cost.text = receivedWeaponIndex?.shopData?.cost?.toString() ?: "null"




    }


}