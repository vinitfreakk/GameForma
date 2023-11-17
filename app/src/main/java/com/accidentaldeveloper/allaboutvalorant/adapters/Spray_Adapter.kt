package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.spray_model.Data
import com.bumptech.glide.Glide


class Spray_Adapter(val data:List<Data>):RecyclerView.Adapter<Spray_Adapter.mySprayVierwHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mySprayVierwHolder {
       val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.spray_rv_item,parent,false)
        return mySprayVierwHolder(view)
    }

    override fun onBindViewHolder(holder: mySprayVierwHolder, position: Int) {
      Glide.with(holder.imageView).load(data[position].fullTransparentIcon).into(holder.imageView)
        holder.spray_name.text = data[position].displayName
    }

    override fun getItemCount(): Int {
      return data.size
    }


    inner class mySprayVierwHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
             val imageView  = itemView.findViewById<ImageView>(R.id.spray_img)
             val spray_name = itemView.findViewById<TextView>(R.id.spray_name)
    }
}