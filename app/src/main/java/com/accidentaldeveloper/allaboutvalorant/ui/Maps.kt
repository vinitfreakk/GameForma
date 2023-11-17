package com.accidentaldeveloper.allaboutvalorant.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.adapters.MapsAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentMapsBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel.MapsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Maps : Fragment() {
 lateinit var binding:FragmentMapsBinding
 private val viewmodel:MapsViewModel by viewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMapsBinding.inflate(layoutInflater,container,false)
        val maps_recyler = binding.mapsRecyclerView
        val previewContainer = binding.previewContainer
       viewmodel.liveData.observe(viewLifecycleOwner,{maps_response->
           maps_recyler.adapter = MapsAdapter(maps_response.data)
           maps_recyler.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
           Log.d("maps_response", "onCreateView: ${maps_response.data}")
       })
        return binding.root
    }


}