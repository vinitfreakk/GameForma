package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Data
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.WeaponStats

class Weapons_Stat_Adapter(private val weapon_stats_list: List<Data>) :
    RecyclerView.Adapter<Weapons_Stat_Adapter.MyWeaponStatsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyWeaponStatsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.weapons_stats_rv_item, parent, false)
        return MyWeaponStatsViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyWeaponStatsViewHolder, position: Int) {
         //holder.weapons_name.text = weapon_stats_list[position]
        holder.weapon_stats_value.text = weapon_stats_list[position].weaponStats.toString()
        holder.weapons_name.text = weapon_stats_list[position].weaponStats.toString()
    }

    override fun getItemCount(): Int {
        return weapon_stats_list.size
    }

    inner class MyWeaponStatsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          val weapons_card = itemView.findViewById<CardView>(R.id.weapon_stats_cardview)
          val weapons_name = itemView.findViewById<TextView>(R.id.weapon_stats_name)
          val weapon_stats_value = itemView.findViewById<TextView>(R.id.weapon_stats_value)
    }
}