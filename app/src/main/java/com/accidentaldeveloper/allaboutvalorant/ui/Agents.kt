package com.accidentaldeveloper.allaboutvalorant.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.adapters.AgentsAdapter
import com.accidentaldeveloper.allaboutvalorant.adapters.MMOAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityMainBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentAgentsBinding
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel


class Agents : Fragment() {
    lateinit var binding:FragmentAgentsBinding
    lateinit var recyclerView: RecyclerView
    val agentList = listOf(
        AgentsAdapterModel("Gekko", R.drawable.omen1),
        AgentsAdapterModel("Harbor", R.drawable.omen1),
        AgentsAdapterModel("Fade", R.drawable.omen1),
        AgentsAdapterModel("Neon", R.drawable.omen1),
        AgentsAdapterModel("Chamber", R.drawable.omen1),
        AgentsAdapterModel("KAY/O", R.drawable.omen1),
        AgentsAdapterModel("Astra", R.drawable.omen1),
        AgentsAdapterModel("Yoru", R.drawable.omen1),
        AgentsAdapterModel("Skye", R.drawable.omen1),
        AgentsAdapterModel("Raze", R.drawable.omen1),
        AgentsAdapterModel("Jett", R.drawable.omen1),
        AgentsAdapterModel("Omen", R.drawable.omen1),
        AgentsAdapterModel("Breach", R.drawable.omen1),
        AgentsAdapterModel("Killjoy", R.drawable.omen1),
        AgentsAdapterModel("Reyna", R.drawable.omen1),
        AgentsAdapterModel("Cypher", R.drawable.omen1),
        AgentsAdapterModel("Viper", R.drawable.omen1),
        AgentsAdapterModel("Sova", R.drawable.omen1),
        AgentsAdapterModel("Sage", R.drawable.omen1),
        AgentsAdapterModel("Phoenix", R.drawable.omen1),
        AgentsAdapterModel("Brimstone", R.drawable.omen1),
        AgentsAdapterModel("ISO", R.drawable.omen1)
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentAgentsBinding.inflate(layoutInflater,container,false)

        recyclerView = binding.agentsRv
        recyclerView.adapter = AgentsAdapter(agentList)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        //binding.myImageView.setBackgroundResource(R.drawable.agents_bg) // Adjust the elevation value as needed
        return binding.root
    }


}