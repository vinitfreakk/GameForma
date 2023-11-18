package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Data
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel

class Weapons_Deatils_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weapons_deatils)
        val receivedWeaponIndex = intent.getIntExtra("weapon_data",0)
        Log.d("agentIndex", "onCreate: ${receivedWeaponIndex}")
    }
}