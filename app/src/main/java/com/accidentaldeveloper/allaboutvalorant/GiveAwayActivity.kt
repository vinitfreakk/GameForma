package com.accidentaldeveloper.allaboutvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.accidentaldeveloper.allaboutvalorant.adapters.GiveAwayAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityGiveAwayBinding
import com.accidentaldeveloper.allaboutvalorant.helper.NetworkManager
import com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel.Giveaway_Viewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GiveAwayActivity : AppCompatActivity() {
    lateinit var binding: ActivityGiveAwayBinding
    private val viewmodel: Giveaway_Viewmodel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val networkManager = NetworkManager(this)
        networkManager.observe(this,{
            if(!it){
                startActivity(Intent(this,ConnectionActivity::class.java))
                finish()

            }
        })



        binding = ActivityGiveAwayBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val giveawayRv = binding.giveawayRv
        viewmodel.liveData.observe(this, { response ->
            giveawayRv.adapter = GiveAwayAdapter(response)
            giveawayRv.layoutManager = GridLayoutManager(this,2)


        })
    }
}