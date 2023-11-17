package com.accidentaldeveloper.allaboutvalorant.adapters

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.bundle_model.Data
import com.bumptech.glide.Glide


class BundelsAdapter(val bundellist: List<Data>) :
    RecyclerView.Adapter<BundelsAdapter.MyBundlesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyBundlesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.bundles_rv_items, parent, false)
        return MyBundlesViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyBundlesViewHolder, position: Int) {
        Glide.with(holder.bundle_img).load(bundellist[position].displayIcon).into(holder.bundle_img)

        /*holder.bundle_layout.startAnimation(
            AnimationUtils.loadAnimation(
                holder.bundle_layout.context,
                R.anim.scale_up
            )
        )*/

        holder.bundle_layout.setOnClickListener {
            val builder = AlertDialog.Builder(it.context,R.style.YourThemeName)
            val dialogView = LayoutInflater.from(it.context).inflate(R.layout.custom_bundles_preview,null)
            val cardView:CardView = dialogView.findViewById(R.id.bundles_preview_card)
            val imageview:ImageView =  dialogView.findViewById(R.id.bundles_img)
            val bundel_name: TextView = dialogView.findViewById(R.id.bundles_name)
            bundel_name.text = bundellist[position].displayName
            Glide.with(imageview).load(bundellist[position].displayIcon).into(imageview)
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
        return bundellist.size
    }

    inner class MyBundlesViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val bundle_img = itemview.findViewById<ImageView>(R.id.bundle_img)
        val bundle_layout = itemview.findViewById<CardView>(R.id.bundle_layout)
    }

}