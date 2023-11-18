package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.adapters.SkinsAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityWeaponsDeatilsBinding
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Data
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel
import com.bumptech.glide.Glide

class Weapons_Deatils_Activity : AppCompatActivity() {
    lateinit var binding: ActivityWeaponsDeatilsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeaponsDeatilsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val receivedWeaponIndex = intent.getSerializableExtra("data") as? Data
        Glide.with(this@Weapons_Deatils_Activity).load(receivedWeaponIndex!!.displayIcon).into(binding.weapon)

        Log.d("agentIndex", "onCreate: ${receivedWeaponIndex}")

        val skin_rv = binding.skinsRv
        skin_rv.adapter = SkinsAdapter(receivedWeaponIndex.skins)
        skin_rv.set3DItem(true)
        skin_rv.setInfinite(true)
        skin_rv.setAlpha(true)
        skin_rv.setFlat(true)
        skin_rv.setIsScrollingEnabled(true)


        val carouselLayoutManager = skin_rv.getCarouselLayoutManager()
        val currentlyCenterPosition = skin_rv.getSelectedPosition()

    }
}