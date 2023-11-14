package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityAgentDetailsBinding
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityMainBinding
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel

class Agent_Details_Activity : AppCompatActivity() {
    lateinit var binding:ActivityAgentDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val agentData = intent.getSerializableExtra("AGENT_DATA") as? AgentsAdapterModel
        val agentIndex = intent?.getIntExtra("AgentIndex",0)
        Log.d("agentIndex", "onCreate: ${agentIndex}")

        val agentImageView = binding.agentimg
        agentImageView.setImageResource(agentData?.agentImg ?: R.drawable.omen1)
        binding.imgBg.setImageResource(agentData?.agentImg ?: R.drawable.omen1)
        agentImageView.startAnimation(AnimationUtils.loadAnimation(this@Agent_Details_Activity,R.anim.fade_in))
        binding.agentName.text = agentData?.agentName ?: "omen"
        binding.agentType.text = agentData?.agentType ?: "omen"

    }
}