package com.accidentaldeveloper.allaboutvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.accidentaldeveloper.allaboutvalorant.adapters.NewsAdapterPager
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityMmoNewsBinding
import com.accidentaldeveloper.allaboutvalorant.helper.NetworkManager
import com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel.News_ViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MmoNewsActivity : AppCompatActivity() {
    private val viewModel: News_ViewModel by viewModels()
    lateinit var binding: ActivityMmoNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMmoNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val networkManager = NetworkManager(this)
        networkManager.observe(this,{
            if(!it){
                startActivity(Intent(this,ConnectionActivity::class.java))
                finish()

            }
        })


        val swipe_news = binding.newsFeedPager
        swipe_news.orientation = ViewPager2.ORIENTATION_VERTICAL


        viewModel.liveData.observe(this, {response ->
            Log.d("data", "onCreate: ${response}")
            val processedNewsResponse = viewModel.processHtmlContent(response)
            swipe_news.adapter = NewsAdapterPager(processedNewsResponse)

        })
    }

    //val vinit = "<p><img class=\\\"type:primaryImage aligncenter size-large\n"
}