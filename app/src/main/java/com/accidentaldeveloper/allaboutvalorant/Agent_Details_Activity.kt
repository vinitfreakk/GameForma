package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel

class Agent_Details_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_details)

        val agentData = intent.getSerializableExtra("AGENT_DATA") as? AgentsAdapterModel
        val deatils_layout = findViewById<CardView>(R.id.deatils_layout)
        val img_bg = findViewById<ImageView>(R.id.img_bg)

        // Now you can use the object's properties in your activity
        // For example, if you have an ImageView with ID agentImageView:
        val agentImageView = findViewById<ImageView>(R.id.agentimg)
        agentImageView.setImageResource(agentData?.agentImg ?: R.drawable.omen1)
        img_bg.setImageResource(agentData?.agentImg ?: R.drawable.omen1)
        agentImageView.startAnimation(AnimationUtils.loadAnimation(this@Agent_Details_Activity,R.anim.scale_up))
        //deatils_layout.startAnimation(AnimationUtils.loadAnimation(this@Agent_Details_Activity,R.anim.slide_in))
        img_bg.startAnimation(AnimationUtils.loadAnimation(this@Agent_Details_Activity,
            androidx.appcompat.R.anim.abc_fade_in))

    }
}