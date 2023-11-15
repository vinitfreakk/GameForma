package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.maps_model.Data


class MapsAdapter(val mapsList:List<Data>):RecyclerView.Adapter<MapsAdapter.myMapsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myMapsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: myMapsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class myMapsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {


    }
}