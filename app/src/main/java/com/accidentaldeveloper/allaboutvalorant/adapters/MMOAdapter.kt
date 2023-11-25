package com.accidentaldeveloper.allaboutvalorant.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.MmoNewsActivity
import com.accidentaldeveloper.allaboutvalorant.R

class MMOAdapter(val data:List<String>):RecyclerView.Adapter<MMOAdapter.Myviewholder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
       val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.uppernavigation,parent,false)
        return Myviewholder(view)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
      holder.items.text = data[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.items.context,MmoNewsActivity::class.java)
             holder.itemView.context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
       return data.size
    }
    class Myviewholder(itemView: View) :RecyclerView.ViewHolder(itemView) {
         val items = itemView.findViewById<TextView>(R.id.tv)
    }

}