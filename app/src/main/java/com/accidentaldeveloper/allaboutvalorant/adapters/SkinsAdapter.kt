package com.accidentaldeveloper.allaboutvalorant.adapters

import android.app.AlertDialog
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.accidentaldeveloper.allaboutvalorant.R
import com.accidentaldeveloper.allaboutvalorant.models.Valorant_Model.weapons_model.Skin
import com.bumptech.glide.Glide
import com.jackandphantom.carouselrecyclerview.view.ReflectionImageView
import android.content.Context
import android.os.Handler
import android.widget.MediaController
import android.widget.ProgressBar

class SkinsAdapter(val skinsList:List<Skin>):RecyclerView.Adapter<SkinsAdapter.mySkinsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mySkinsViewHolder {
      val infalter = LayoutInflater.from(parent.context)
        val view = infalter.inflate(R.layout.skins_rv_items,parent,false)
        return mySkinsViewHolder(view)
    }

    override fun getItemCount(): Int {
      return skinsList.size
    }



    //workin very good
    /*override fun onBindViewHolder(holder: mySkinsViewHolder, position: Int) {
        Glide.with(holder.skinImage).load(skinsList[position].displayIcon).into(holder.skinImage)
        holder.skinname.text = skinsList[position].displayName

        val builder = AlertDialog.Builder(holder.itemView.context, R.style.YourThemeName)
        val dialogView = LayoutInflater.from(holder.itemView.context).inflate(R.layout.custom_video_preview, null)

        val cardView: CardView = dialogView.findViewById(R.id.viddo_preview_card)
        val videoView: VideoView = dialogView.findViewById(R.id.video_preview)
        val progressBar: ProgressBar = dialogView.findViewById(R.id.progressBar)

        val url = Uri.parse(skinsList[position].levels.lastOrNull()?.streamedVideo ?: "")

        holder.skincard.setOnClickListener {
            if (url.toString().isNotBlank()) {
                // Show the progress bar
                progressBar.visibility = View.VISIBLE

                videoView.setVideoURI(url)
                videoView.setOnPreparedListener { mp ->
                    // Hide the progress bar when the video is prepared and starts playing
                    progressBar.visibility = View.GONE
                    mp.start()
                }

                // Other video setup code (if needed)

                builder.setView(dialogView)
                val alertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.setCanceledOnTouchOutside(false)  // Set this property to false
                alertDialog.setOnDismissListener {
                    // Release resources associated with VideoView when dialog is dismissed
                    videoView.stopPlayback()
                }
                alertDialog.show()
            } else {
                Toast.makeText(holder.itemView.context, "Video Not Found", Toast.LENGTH_SHORT).show()
            }
        }
    }*/

    // testing
    //working good without crash
    /*override fun onBindViewHolder(holder: mySkinsViewHolder, position: Int) {
        Glide.with(holder.skinImage).load(skinsList[position].displayIcon).into(holder.skinImage)
        holder.skinname.text = skinsList[position].displayName

        val builder = AlertDialog.Builder(holder.itemView.context, R.style.YourThemeName)

        val url = Uri.parse(skinsList[position].levels.lastOrNull()?.streamedVideo ?: "")

        holder.skincard.setOnClickListener {
            if (url.toString().isNotBlank()) {
                // Create a new dialogView instance each time
                val dialogView = LayoutInflater.from(holder.itemView.context).inflate(R.layout.custom_video_preview, null)

                val cardView: CardView = dialogView.findViewById(R.id.viddo_preview_card)
                val videoView: VideoView = dialogView.findViewById(R.id.video_preview)
                val progressBar: ProgressBar = dialogView.findViewById(R.id.progressBar)

                // Show the progress bar
                progressBar.visibility = View.VISIBLE

                videoView.setVideoURI(url)
                videoView.setOnPreparedListener { mp ->
                    // Hide the progress bar when the video is prepared and starts playing
                    progressBar.visibility = View.GONE
                    mp.start()
                }

                // Other video setup code (if needed)

                builder.setView(dialogView)
                val alertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.setCanceledOnTouchOutside(false)  // Set this property to false

                videoView.setOnCompletionListener {
                    // Video playback completed, show progress bar
                    progressBar.visibility = View.VISIBLE
                    // Add a delay to make sure the progress bar is visible for a moment
                    Handler().postDelayed({
                        // Dismiss the dialog
                        progressBar.visibility = View.GONE
                        alertDialog.dismiss()
                    }, 1000) // You can adjust the delay duration if needed
                }

                videoView.setOnErrorListener { _, what, extra ->
                    // Handle video preparation error, show progress bar
                    progressBar.visibility = View.VISIBLE
                    Toast.makeText(holder.itemView.context, "Video Error: $what, $extra", Toast.LENGTH_SHORT).show()
                    // Dismiss the dialog in case of an error
                    alertDialog.dismiss()
                    true
                }

                alertDialog.setOnDismissListener {
                    // Release resources associated with VideoView when dialog is dismissed
                    videoView.stopPlayback()
                }

                alertDialog.show()
            } else {
                Toast.makeText(holder.itemView.context, "Video Not Found", Toast.LENGTH_SHORT).show()
            }
        }
    }*/

    override fun onBindViewHolder(holder: mySkinsViewHolder, position: Int) {
        Glide.with(holder.skinImage).load(skinsList[position].displayIcon).into(holder.skinImage)
        holder.skinname.text = skinsList[position].displayName

        val builder = AlertDialog.Builder(holder.itemView.context, R.style.YourThemeName)

        val url = Uri.parse(skinsList[position].levels.lastOrNull()?.streamedVideo ?: "")

        holder.skincard.setOnClickListener {
            if (url.toString().isNotBlank()) {
                val dialogView = LayoutInflater.from(holder.itemView.context).inflate(R.layout.custom_video_preview, null)

                val cardView: CardView = dialogView.findViewById(R.id.viddo_preview_card)
                val videoView: VideoView = dialogView.findViewById(R.id.video_preview)
                val progressBar: ProgressBar = dialogView.findViewById(R.id.progressBar)

                val mediaController = MediaController(holder.itemView.context)
                mediaController.setAnchorView(videoView)
                videoView.setMediaController(mediaController)

                progressBar.visibility = View.VISIBLE

                videoView.setVideoURI(url)
                videoView.setOnPreparedListener { mp ->
                    progressBar.visibility = View.GONE
                    mp.start()
                }

                builder.setView(dialogView)
                val alertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.setCanceledOnTouchOutside(false)

                videoView.setOnCompletionListener {
                    progressBar.visibility = View.VISIBLE
                    Handler().postDelayed({
                        progressBar.visibility = View.GONE
                        alertDialog.dismiss()
                    }, 1000)
                }

                videoView.setOnErrorListener { _, what, extra ->
                    progressBar.visibility = View.VISIBLE
                    Toast.makeText(holder.itemView.context, "Video Error: $what, $extra", Toast.LENGTH_SHORT).show()
                    alertDialog.dismiss()
                    true
                }

                alertDialog.setOnDismissListener {
                    videoView.stopPlayback()
                }

                alertDialog.show()
            } else {
                Toast.makeText(holder.itemView.context, "Video Not Found", Toast.LENGTH_SHORT).show()
            }
        }
    }












    inner class mySkinsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       val skinImage = itemView.findViewById<ReflectionImageView>(R.id.gun_skin_img)
        val skinname = itemView.findViewById<TextView>(R.id.skin_name)
        val skincard = itemView.findViewById<CardView>(R.id.skins_card)

    }

}