package com.accidentaldeveloper.allaboutvalorant.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import org.w3c.dom.Text

class MyAdapter(val data:List<String>):RecyclerView.Adapter<MyAdapter.Myviewholder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
       val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.uppernavigation,parent,false)
        return Myviewholder(view)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
      holder.items.text = data[position]
    }
    override fun getItemCount(): Int {
       return data.size
    }
    class Myviewholder(itemView: View) :RecyclerView.ViewHolder(itemView) {
         val items = itemView.findViewById<TextView>(R.id.tv)
    }

}