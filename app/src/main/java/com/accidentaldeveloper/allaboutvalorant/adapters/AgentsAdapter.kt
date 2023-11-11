package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.adapterModel.AgentsAdapterModel

class AgentsAdapter(val data: List<AgentsAdapterModel>):RecyclerView.Adapter<AgentsAdapter.myAgentsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAgentsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.agents_item_rv,parent,false)
        return myAgentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: myAgentsViewHolder, position: Int) {

         holder.imageView.setImageResource(data[position].agentImg)
         holder.agentName.text = data[position].agentName
    }

    override fun getItemCount(): Int {
      return data.size
    }

    class myAgentsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
         val imageView = itemView.findViewById<ImageView>(R.id.agents_img)
        val agentName = itemView.findViewById<TextView>(R.id.agentName)
    }
}