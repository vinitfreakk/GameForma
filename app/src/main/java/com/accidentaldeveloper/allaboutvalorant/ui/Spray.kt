package com.accidentaldeveloper.allaboutvalorant.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentMapsBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentSprayBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel.SprayViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Spray : Fragment() {

   lateinit var binding: FragmentSprayBinding
    val viewModel:SprayViewModel by viewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSprayBinding.inflate(layoutInflater,container,false)
        viewModel.liveData.observe(viewLifecycleOwner,{spray_repsonse->
            Log.d("spray_repsonse", "onCreateView: ${spray_repsonse.data}")
        })
        return binding.root
    }

}