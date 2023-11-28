package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityGiveAwayBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel.Giveaway_Viewmodel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
@AndroidEntryPoint
class GamesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)
    }
}