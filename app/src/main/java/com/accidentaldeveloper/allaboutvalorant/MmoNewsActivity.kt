package com.accidentaldeveloper.allaboutvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.accidentaldeveloper.allaboutvalorant.adapters.NewsAdapterPager
import com.accidentaldeveloper.allaboutvalorant.databinding.ActivityMmoNewsBinding
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
        val swipe_news = binding.newsFeedPager
        swipe_news.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewModel.liveData.observe(this, { response ->
            Log.d("data", "onCreate: ${response}")
            val processedNewsResponse = viewModel.processHtmlContent(response)
           swipe_news.adapter = NewsAdapterPager(processedNewsResponse)

        })
    }

    //val vinit = "<p><img class=\\\"type:primaryImage aligncenter size-large\n"
}