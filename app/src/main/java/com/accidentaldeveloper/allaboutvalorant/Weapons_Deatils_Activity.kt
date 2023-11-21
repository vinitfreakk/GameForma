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


    // on below line we are creating
    // a variable for our video url.
    var videoUrl =
        "https://valorant.dyn.riotcdn.net/x/videos/release-07.10/bd9d37c4-4f6f-3766-c134-30b6782e714f_default_universal.mp4"

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


    }
}