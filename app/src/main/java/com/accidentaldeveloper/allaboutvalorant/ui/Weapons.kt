package com.accidentaldeveloper.allaboutvalorant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentMapsBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentWeaponsBinding

class Weapons : Fragment() {
    lateinit var binding: FragmentWeaponsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentWeaponsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}