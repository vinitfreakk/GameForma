package com.accidentaldeveloper.allaboutvalorant.viewmodel.MMOViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response
import com.accidentaldeveloper.allaboutvalorant.models.MMO_Models.mmo_news.News_response_item
import com.accidentaldeveloper.allaboutvalorant.repository.MMO_Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class News_ViewModel @Inject constructor(private val repository: MMO_Repository) : ViewModel() {
    val mutableLiveData = MutableLiveData<News_response>()
    val liveData: LiveData<News_response> = mutableLiveData

    init {
        getNewsFeed()
    }

    fun getNewsFeed() = viewModelScope.launch {
        try {
            repository.getNewsFeed()?.let { response ->
                if (response.isSuccessful) {
                    mutableLiveData.postValue(response.body())
                }
            }
        } catch (e: Exception) {
            Log.e("error in news viewmodel", "getNewsFeed: ${e.message}")
        }
    }

    // Function to remove HTML tags from a given string
    fun removeHtmlTags(input: String): String {
        return input.replace(Regex("<[^>]*>"), "")
    }

    // Function to process HTML content in the LiveData
    fun processHtmlContent(newsResponse: News_response): News_response {
        // Process each item in the list
        val processedItems = newsResponse.map { item ->
            val processedTitle = removeHtmlTags(item.title)
            val processedContent = removeHtmlTags(item.articleContent)

            // Create a new News_response_item with processed data
            News_response_item(
                articleContent = processedContent,
                articleUrl = item.articleUrl,
                id = item.id,
                mainImage = item.mainImage,
                shortDescription = item.shortDescription,
                thumbnail = item.thumbnail,
                title = processedTitle
            )
        }

        // Create a new News_response with processed items
        return News_response().apply {
            addAll(processedItems)
        }
    }
}

