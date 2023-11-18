package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Skin
import com.bumptech.glide.Glide
import com.jackandphantom.carouselrecyclerview.view.ReflectionImageView

class SkinsAdapter(val skinsList:List<Skin>):RecyclerView.Adapter<SkinsAdapter.mySkinsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mySkinsViewHolder {
      val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.skins_rv_items,parent,false)
        return mySkinsViewHolder(view)
    }

    override fun getItemCount(): Int {
      return skinsList.size
    }

    override fun onBindViewHolder(holder: mySkinsViewHolder, position: Int) {
         Glide.with(holder.skinImage).load(skinsList[position].displayIcon).into(holder.skinImage)
        holder.skinname.text = skinsList[position].displayName
    }

    inner class mySkinsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       val skinImage = itemView.findViewById<ReflectionImageView>(R.id.gun_skin_img)
        val skinname = itemView.findViewById<TextView>(R.id.skin_name)
    }

}