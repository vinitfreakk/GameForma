package com.accidentaldeveloper.allaboutvalorant.di

import com.accidentaldeveloper.allaboutvalorant.api.ValorantApiService
import com.accidentaldeveloper.allaboutvalorant.helper.AppConstant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    //retrofit instance.
    @Provides
    fun provide_Retrofit_Instance() = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(AppConstant.BASE_URL)
        .build()
        .create(ValorantApiService::class.java)

}