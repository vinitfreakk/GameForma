package com.accidentaldeveloper.allaboutvalorant.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.Weapons_Deatils_Activity
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Data
import com.bumptech.glide.Glide

class Weapons_Adapter(val weaponsList: List<Data>):RecyclerView.Adapter<Weapons_Adapter.myWeaponsViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myWeaponsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.weapons_rv_items,parent,false)
        return myWeaponsViewHolder(view)
    }


    override fun onBindViewHolder(holder: myWeaponsViewHolder, position: Int) {
          Glide.with(holder.weaponImage).load(weaponsList[position].displayIcon).into(holder.weaponImage)
           holder.weaponName.text = weaponsList[position].displayName
           holder.weapon_card.startAnimation(
               AnimationUtils.loadAnimation(
                   holder.weapon_card.context,
                   R.anim.scale_up
               )
           )
       /* holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Weapons_Deatils_Activity::class.java)
            intent.putExtra("weapon_data",weaponsList[position])
            holder.itemView.context.startActivity(intent)

        }*/

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Weapons_Deatils_Activity::class.java)
            intent.putExtra("weapon_data", position)
            intent.putExtra("data",weaponsList[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       return weaponsList.size
    }

    inner class myWeaponsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
          val weaponImage = itemView.findViewById<ImageView>(R.id.weapon_img)
          val weaponName = itemView.findViewById<TextView>(R.id.weapon_name)
          val weapon_card = itemView.findViewById<CardView>(R.id.weapons_card)
    }
}