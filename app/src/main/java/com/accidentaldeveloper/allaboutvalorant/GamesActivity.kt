package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.accidentaldeveloper.allaboutvalorant.adapters.GamesAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityGamesBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityGiveAwayBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel.GamesViewModel
import com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel.Giveaway_Viewmodel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
@AndroidEntryPoint
class GamesActivity : AppCompatActivity() {
    lateinit var binding:ActivityGamesBinding
    private val viewmodel:GamesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val gamesRecyclerView = binding.gamesRv
        viewmodel.liveData.observe(this,{games_response->
            gamesRecyclerView.adapter = GamesAdapter(games_response)
            gamesRecyclerView.layoutManager = GridLayoutManager(this,2)
        })
    }
}