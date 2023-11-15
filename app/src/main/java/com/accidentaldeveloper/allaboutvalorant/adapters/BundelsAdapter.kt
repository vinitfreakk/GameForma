package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model.Data
import com.bumptech.glide.Glide


class BundelsAdapter(val bundellist: List<Data>) :
    RecyclerView.Adapter<BundelsAdapter.MyBundlesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyBundlesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.bundles_rv_items,parent,false)
        return MyBundlesViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyBundlesViewHolder, position: Int) {
        Glide.with(holder.bundle_img).load(bundellist[position].displayIcon).into(holder.bundle_img)
    }

    override fun getItemCount(): Int {
      return bundellist.size
    }

    inner class MyBundlesViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val bundle_img = itemview.findViewById<ImageView>(R.id.bundle_img)
    }

}