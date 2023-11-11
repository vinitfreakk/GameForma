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
        AgentsAdapterModel("Gekko", R.drawable.gekko,"Initiator"),//0
        AgentsAdapterModel("Fade", R.drawable.fade,"Initiator"),//1
        AgentsAdapterModel("Breach", R.drawable.breach,"Initiator"),//2
        AgentsAdapterModel("DeadLock", R.drawable.deadlock,"Sentinel"),//3
        AgentsAdapterModel("Raze", R.drawable.raze,"Duelist"),//4
        AgentsAdapterModel("Chamber", R.drawable.chamber,"Sentinel"),//5
        AgentsAdapterModel("KAY/O", R.drawable.kayo,"Initiator"),//6
        AgentsAdapterModel("Skye", R.drawable.skye,"Initiator"),//7
        AgentsAdapterModel("Cypher", R.drawable.cypher,"Sentinel"),//8
        AgentsAdapterModel("Sova", R.drawable.sova,"Initiator"),//10
        AgentsAdapterModel("Killjoy", R.drawable.killjoy,"Sentinel"),//11
        AgentsAdapterModel("Harbor", R.drawable.harbor,"Controller"),//12
        AgentsAdapterModel("Viper", R.drawable.viper,"Controller"),//13
        AgentsAdapterModel("Phoenix", R.drawable.phoniex,"Duelist"),//14
        AgentsAdapterModel("Astra", R.drawable.astra,"Controller"),//15
        AgentsAdapterModel("Brimstone", R.drawable.brim,"Controller"),//16
        AgentsAdapterModel("ISO", R.drawable.iso,"Duelist"),//17
        AgentsAdapterModel("Neon", R.drawable.neon,"Duelist"),//18
        AgentsAdapterModel("Yoru", R.drawable.yoru,"Duelist"),//19
        AgentsAdapterModel("Sage", R.drawable.sage,"Sentinel"),//20
        AgentsAdapterModel("Reyna", R.drawable.ryena,"Duelist"),//21
        AgentsAdapterModel("omen", R.drawable.omen1,"Controller"),//22
        AgentsAdapterModel("Jett", R.drawable.jett3,"Duelist"),//23



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