package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.adapters.AgentsAbilitesAdapter
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityAgentDetailsBinding
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Ability
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel
import com.accidentaldeveloper.allaboutvalorant.viewmodel.valorantViewModel.AgentsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Agent_Details_Activity : AppCompatActivity() {
    lateinit var binding:ActivityAgentDetailsBinding
    lateinit var recyclerView: RecyclerView
    private val viewmodel: AgentsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val agentData = intent.getSerializableExtra("AGENT_DATA") as? AgentsAdapterModel
        val agentIndex = intent.getIntExtra("AgentIndex",0)
        Log.d("agentIndex", "onCreate: ${agentIndex}")

        val agentImageView = binding.agentimg
        agentImageView.setImageResource(agentData?.agentImg ?: R.drawable.omen1)
        binding.imgBg.setImageResource(agentData?.agentImg ?: R.drawable.omen1)
        agentImageView.startAnimation(AnimationUtils.loadAnimation(this@Agent_Details_Activity,R.anim.fade_in))
        binding.agentName.text = agentData?.agentName ?: "omen"
        binding.agentType.text = agentData?.agentType ?: "omen"

        recyclerView = binding.agentPowerRv
       viewmodel.liveData.observe(this,{
           val response = it.data.get(agentIndex).abilities
           binding.agentBio.text = it.data.get(agentIndex).description
           val list = response as ArrayList<Ability>
           recyclerView.adapter = AgentsAbilitesAdapter(list)
           recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
       })

    }
}