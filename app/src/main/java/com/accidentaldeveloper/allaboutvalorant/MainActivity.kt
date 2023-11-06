package com.accidentaldeveloper.allaboutvalorant

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityMainBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.AgentsViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewmodel:AgentsViewModel by viewModels()
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

          binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)


        binding.bottomNavigationView.itemTextAppearanceActive = R.style.CustomBottomNavTextAppearance
        binding.bottomNavigationView.itemTextAppearanceInactive = R.style.CustomBottomNavTextAppearance
        val navController = findNavController(R.id.fragment)
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)




        viewmodel.liveData.observe(this,{
            Log.d("aajana", "onCreate: ${it.data}")
        })
    }
}