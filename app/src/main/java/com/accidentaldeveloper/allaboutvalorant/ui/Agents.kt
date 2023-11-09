package com.accidentaldeveloper.allaboutvalorant.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentAgentsBinding


class Agents : Fragment() {
    lateinit var binding:FragmentAgentsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentAgentsBinding.inflate(layoutInflater,container,false)
        return binding.root
        binding.myImageView.setBackgroundResource(R.drawable.agents_bg) // Adjust the elevation value as needed

    }


}