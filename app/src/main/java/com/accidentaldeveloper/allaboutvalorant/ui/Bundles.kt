package com.accidentaldeveloper.allaboutvalorant.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.adapters.BundelsAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentAgentsBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentBundlesBinding
import com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel.BundlesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Bundles : Fragment() {
  lateinit var binding: FragmentBundlesBinding
  private val viewModel:BundlesViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBundlesBinding.inflate(layoutInflater,container,false)
        val bundles_rv = binding.bundlesRv
          viewModel.livedata.observe(viewLifecycleOwner,{bundles->
              bundles_rv.adapter = BundelsAdapter(bundles.data)
              bundles_rv.layoutManager = GridLayoutManager(requireContext(),2)
              Log.d("bundles", "onCreateView: ${bundles}")
          })
        return binding.root
    }


}