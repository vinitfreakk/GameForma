package com.accidentaldeveloper.allaboutvalorant.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.adapters.AgentsAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.FragmentAgentsBinding
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator


class Agents : Fragment() {
    lateinit var binding:FragmentAgentsBinding
    lateinit var recyclerView: RecyclerView
    val agentList = listOf(
        AgentsAdapterModel("omen", R.drawable.omen1),
        AgentsAdapterModel("Phoenix", R.drawable.phoniex),
        AgentsAdapterModel("Reyna", R.drawable.ryena),
        AgentsAdapterModel("Yoru", R.drawable.yoru),
        AgentsAdapterModel("Chamber", R.drawable.chamber),
        AgentsAdapterModel("KAY/O", R.drawable.kayo),
        AgentsAdapterModel("Astra", R.drawable.astra),
        AgentsAdapterModel("Neon", R.drawable.neon),
        AgentsAdapterModel("Skye", R.drawable.skye),
        AgentsAdapterModel("Raze", R.drawable.raze),
        AgentsAdapterModel("Jett", R.drawable.jett3),
        AgentsAdapterModel("Gekko", R.drawable.gekko),
        AgentsAdapterModel("Breach", R.drawable.breach),
        AgentsAdapterModel("Killjoy", R.drawable.killjoy),
        AgentsAdapterModel("Fade", R.drawable.fade),
        AgentsAdapterModel("Cypher", R.drawable.cypher),
        AgentsAdapterModel("Viper", R.drawable.viper),
        AgentsAdapterModel("Sova", R.drawable.sova),
        AgentsAdapterModel("Sage", R.drawable.sage),
        AgentsAdapterModel("Harbor", R.drawable.harbor),
        AgentsAdapterModel("Brimstone", R.drawable.brim),
        AgentsAdapterModel("ISO", R.drawable.iso)
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