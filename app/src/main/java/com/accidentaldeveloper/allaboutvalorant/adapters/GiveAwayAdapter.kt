package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_giveaways.Giveaways_response_item
import com.bumptech.glide.Glide

class GiveAwayAdapter(private val giveAwayList:List<Giveaways_response_item>):RecyclerView.Adapter<GiveAwayAdapter.MyGiveAwayHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyGiveAwayHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.giveaway_rv_item,parent,false)
        return MyGiveAwayHolder(view)
    }

    override fun onBindViewHolder(holder: MyGiveAwayHolder, position: Int) {
        Glide.with(holder.giveaway_img).load(giveAwayList[position].mainImage).into(holder.giveaway_img)
        holder.giveaway_keys.text = giveAwayList[position].keysLeft
        holder.giveaway_title.text =  giveAwayList[position].title


    }
    override fun getItemCount(): Int {
       return giveAwayList.size
    }

    inner class MyGiveAwayHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val giveaway_img = itemView.findViewById<ImageView>(R.id.giveaway_img)
        val giveaway_title = itemView.findViewById<TextView>(R.id.giveaway_title)
        val giveaway_keys = itemView.findViewById<TextView>(R.id.giveway_keys_left)

    }
}