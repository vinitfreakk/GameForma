package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.agent_model.Ability
import com.bumptech.glide.Glide

class AgentsAbilitesAdapter(val abilites: List<Ability>) :
    RecyclerView.Adapter<AgentsAbilitesAdapter.myAgents_Abilites_ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAgents_Abilites_ViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.agents_abilites_rv_items,parent,false)
        return myAgents_Abilites_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: myAgents_Abilites_ViewHolder, position: Int) {
        holder.abilites_txt.text = abilites[position].displayName
        holder.abilitesInfo.text = abilites[position].description
       Glide.with(holder.abiliteImage).load(abilites[position].displayIcon).into(holder.abiliteImage)
        holder.agent_abilites_card.startAnimation(
            AnimationUtils.loadAnimation(
                holder.agent_abilites_card.context,
                R.anim.scale_up
            )
        )
    }

    override fun getItemCount(): Int {
       return abilites.size
    }

    class myAgents_Abilites_ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       val abilites_txt = itemView.findViewById<TextView>(R.id.agent_ablites_name)
        val abilitesInfo  = itemView.findViewById<TextView>(R.id.agent_abilities_data)
        val abiliteImage = itemView.findViewById<ImageView>(R.id.ablites_img)
        val agent_abilites_card = itemView.findViewById<CardView>(R.id.agent_abilites_card)
    }
}




