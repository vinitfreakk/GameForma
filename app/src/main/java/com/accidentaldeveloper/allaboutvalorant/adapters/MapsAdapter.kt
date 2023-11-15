package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Data
import com.bumptech.glide.Glide


class MapsAdapter(val mapsList: List<Data>) : RecyclerView.Adapter<MapsAdapter.myMapsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myMapsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.maps_layout_rv_item,parent,false)
        return myMapsViewHolder(view)
    }

    override fun onBindViewHolder(holder: myMapsViewHolder, position: Int) {
         holder.map_name.text = mapsList[position].displayName
        holder.map_info.text =  mapsList[position].narrativeDescription
        Glide.with(holder.map_image).load(mapsList[position].splash).into(holder.map_image)
    }

    override fun getItemCount(): Int {
        return mapsList.size
    }

    inner class myMapsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val map_image = itemView.findViewById<ImageView>(R.id.map_img)
        val map_name = itemView.findViewById<TextView>(R.id.map_name)
        val map_info = itemView.findViewById<TextView>(R.id.map_info)
    }
}