package com.accidentaldeveloper.allaboutvalorant.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.Games.Game_ResponseItem
import com.bumptech.glide.Glide

class GamesAdapter(private val gamelist: List<Game_ResponseItem>) :
    RecyclerView.Adapter<GamesAdapter.myGamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myGamesViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.games_rv_item, parent, false)
        return myGamesViewHolder(view)
    }


    override fun onBindViewHolder(holder: myGamesViewHolder, position: Int) {
      Glide.with(holder.game_img).load(gamelist[position].thumbnail).into(holder.game_img)
        holder.game_name.text = gamelist[position].title
        holder.game_paltform.text = "Platform:${gamelist[position].platform}"
        holder.games_card.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(gamelist[position].gameUrl))
            try {
                holder.games_card.context.startActivity(intent)
            } catch (e: android.content.ActivityNotFoundException) {
                intent.data = Uri.parse(gamelist[position].gameUrl)
                holder.games_card.context.startActivity(intent)
            }
        }
    }


    override fun getItemCount(): Int {
        return gamelist.size
    }


    inner class myGamesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val game_img = itemView.findViewById<ImageView>(R.id.game_img)
        val game_name = itemView.findViewById<TextView>(R.id.game_name)
        val game_paltform = itemView.findViewById<TextView>(R.id.game_paltfrom)
        val games_card = itemView.findViewById<CardView>(R.id.games_card)
    }

}