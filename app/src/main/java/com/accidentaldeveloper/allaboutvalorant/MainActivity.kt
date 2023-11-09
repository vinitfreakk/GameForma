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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.adapters.MyAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityMainBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.AgentsViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewmodel: AgentsViewModel by viewModels()
    lateinit var binding: ActivityMainBinding
    lateinit var recyclerView: RecyclerView

    private val list = listOf<String>("Ne ws","Giveaways","PC games","Browser games","Categories")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNavigationView.itemTextAppearanceActive = R.style.CustomBottomNavTextAppearance
        binding.bottomNavigationView.itemTextAppearanceInactive = R.style.CustomBottomNavTextAppearance

        val navController = findNavController(R.id.fragment)
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)

        /*The navController.addOnDestinationChangedListener lambda expression has three parameters, which represent the following:

        The first parameter (_) represents the NavController instance, but in this case, you're not using it within the lambda expression, so it is often replaced with an underscore (_) to indicate that it's not being used. This is a common convention in Kotlin to indicate that a parameter is not needed.

        The second parameter (destination) represents the NavDestination that corresponds to the current destination, which is the fragment being navigated to.

        The third parameter (_) represents the Bundle of arguments associated with the navigation action, and like the first parameter, it's often not used within the lambda expression.

         So, in this context, you can safely ignore the first and third parameters by replacing them with underscores (_) because you don't need them to achieve the desired functionality, which is to update the TextView based on the current fragment's ID. You're mainly interested in the destination parameter to check which fragment is currently displayed and update the TextView accordingly.*/
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.agents -> {
                    // Update the TextView for Fragment 1
                    binding.actionBar.text = "agents"
                }

                R.id.bundles -> {
                    // Update the TextView for Fragment 2
                    binding.actionBar.text = "bundles"
                }

                R.id.weapons -> {
                    // Update the TextView for Fragment 3
                    binding.actionBar.text = "weapons"
                }

                R.id.maps -> {
                    // Update the TextView for Fragment 4
                    binding.actionBar.text = "maps"
                }

                R.id.spray -> {
                    // Update the TextView for Fragment 5
                    binding.actionBar.text = "spray"
                }
            }

            recyclerView = binding.recyler
            recyclerView.adapter = MyAdapter(list)
            recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
            viewmodel.liveData.observe(this, {
                Log.d("aajana", "onCreate: ${it.data.get(21)}")
            })
        }
    }
}