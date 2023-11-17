package com.accidentaldeveloper.allaboutvalorant.adapters

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Data
import com.bumptech.glide.Glide
import kotlinx.coroutines.NonDisposableHandle.parent


class MapsAdapter(val mapsList: List<Data>) : RecyclerView.Adapter<MapsAdapter.myMapsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myMapsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.maps_layout_rv_item,parent,false)
        return myMapsViewHolder(view)
    }

    override fun onBindViewHolder(holder: myMapsViewHolder, position: Int) {
         holder.map_name.text = mapsList[position].displayName
        holder.map_info.text =  mapsList[position].narrativeDescription
        holder.maps_layout.startAnimation(
            AnimationUtils.loadAnimation(
                holder.maps_layout.context,
                R.anim.scale_up
            )
        )

        Glide.with(holder.map_image).load(mapsList[position].splash).into(holder.map_image)
        /*holder.maps_layout.setOnLongClickListener {
            recyclerView.suppressLayout(true)
            recyclerView.alpha = 0.5f
            frameLayout.visibility = View.VISIBLE
            true
        }


        frameLayout.setOnClickListener {
            recyclerView.alpha = 1f
            recyclerView.suppressLayout(false)
            frameLayout.visibility = View.GONE
        }*/

        holder.maps_layout.setOnClickListener {
            val builder = AlertDialog.Builder(it.context,R.style.YourThemeName)
            val dialogView = LayoutInflater.from(it.context).inflate(R.layout.custom_preview,null)
            val cardView:CardView = dialogView.findViewById(R.id.preview_card)
            val imageview:ImageView =  dialogView.findViewById(R.id.preview_img)
            val site:TextView = dialogView.findViewById(R.id.sites)
            val map_name:TextView = dialogView.findViewById(R.id.map)
            site.text = "tactical Description ${mapsList[position].tacticalDescription}"
            map_name.text = mapsList[position].displayName
            Glide.with(imageview).load(mapsList[position].displayIcon).into(imageview)
            cardView.startAnimation(
                AnimationUtils.loadAnimation(
                    cardView.context,
                    R.anim.scale_up
                )
            )
            builder.setView(dialogView)
            builder.setCancelable(true)
            builder.show()
        }


    }

    override fun getItemCount(): Int {
        return mapsList.size
    }

    inner class myMapsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val map_image = itemView.findViewById<ImageView>(R.id.map_img)
        val map_name = itemView.findViewById<TextView>(R.id.map_name)
        val map_info = itemView.findViewById<TextView>(R.id.map_info)
        val maps_layout  = itemView.findViewById<CardView>(R.id.mapslayout)
    }
}