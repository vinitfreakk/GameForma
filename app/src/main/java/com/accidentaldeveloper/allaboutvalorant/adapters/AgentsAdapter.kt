package com.accidentaldeveloper.allaboutvalorant.adapters

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.Agent_Details_Activity
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel

class AgentsAdapter(val data: List<AgentsAdapterModel>) :
    RecyclerView.Adapter<AgentsAdapter.myAgentsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAgentsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.agents_item_rv, parent, false)
        return myAgentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: myAgentsViewHolder, position: Int) {

        holder.imageView.setImageResource(data[position].agentImg)
        holder.agentName.text = data[position].agentName
        holder.agentType.text = data[position].agentType
        holder.mainlayout.startAnimation(
            AnimationUtils.loadAnimation(
                holder.mainlayout.context,
                R.anim.scale_up
            )
        )
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Agent_Details_Activity::class.java)
            intent.putExtra("AGENT_DATA", data[position])
            if(position>=9){
                intent.putExtra("AgentIndex",position+1)
            }else{
                intent.putExtra("AgentIndex",position)
            }

            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return data.size
    }

    class myAgentsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.agents_img)
        val agentName = itemView.findViewById<TextView>(R.id.agentName)
        val agentType = itemView.findViewById<TextView>(R.id.agentType)
        val mainlayout = itemView.findViewById<LinearLayout>(R.id.mainlayout)
    }
}