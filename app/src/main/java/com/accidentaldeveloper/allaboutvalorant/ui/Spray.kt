package com.accidentaldeveloper.allaboutvalorant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentMapsBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentSprayBinding

class Spray : Fragment() {

   lateinit var binding: FragmentSprayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSprayBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}