package com.accidentaldeveloper.allaboutvalorant.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response_item
import com.bumptech.glide.Glide

class NewsAdapterPager(private val newslist: List<News_response_item>) :
    RecyclerView.Adapter<NewsAdapterPager.MyNewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyNewsViewHolder {
        val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.news_feed_pager_layout, parent, false)
        return MyNewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyNewsViewHolder, position: Int) {
       holder.news_headline.text = newslist[position].shortDescription
        holder.news_disp.text = newslist[position].articleContent
        Glide.with(holder.news_img).load(newslist[position].mainImage).into(holder.news_img)
        holder.shareImg.setOnClickListener {
            val sharingIntent = Intent(Intent.ACTION_SEND)
            sharingIntent.type = "text/plain"
            val shareBody = "Check This out ${newslist[position].articleUrl}"
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here")
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            holder.shareImg.context.startActivity(Intent.createChooser(sharingIntent, "Share via"))
        }

        holder.redirect.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(newslist[position].articleUrl))
            try {
                holder.redirect.context.startActivity(intent)
            } catch (e: android.content.ActivityNotFoundException) {
                intent.data = Uri.parse(newslist[position].articleUrl)
                holder.redirect.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
       return newslist.size
    }

    inner class MyNewsViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val news_disp = itemview.findViewById<TextView>(R.id.news_disp)
        val news_headline = itemview.findViewById<TextView>(R.id.news_headline)
        val news_img = itemview.findViewById<ImageView>(R.id.news_img)
        val shareImg = itemview.findViewById<ImageView>(R.id.share_img)
        val redirect = itemview.findViewById<ImageView>(R.id.more_info)
    }
}