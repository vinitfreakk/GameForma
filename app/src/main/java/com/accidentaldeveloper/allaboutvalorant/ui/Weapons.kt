package com.accidentaldeveloper.allaboutvalorant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.adapters.Weapons_Adapter
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentMapsBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentWeaponsBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel.WeaponsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Weapons : Fragment() {
    lateinit var binding: FragmentWeaponsBinding
    private val viewmodel:WeaponsViewModel by viewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentWeaponsBinding.inflate(layoutInflater,container,false)
        val weapons_recyler = binding.weaponsRecycler
        viewmodel.liveData.observe(viewLifecycleOwner,{weapon_response->
            weapons_recyler.adapter = Weapons_Adapter(weapon_response.data)
            weapons_recyler.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)

        })
        return binding.root
    }


}