package com.accidentaldeveloper.allaboutvalorant.di

import com.accidentaldeveloper.allaboutvalorant.api.MMOApiService
import com.accidentaldeveloper.allaboutvalorant.api.ValorantApiService
import com.accidentaldeveloper.allaboutvalorant.helper.ApiAnnotation
import com.accidentaldeveloper.allaboutvalorant.helper.AppConstant
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Named


@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    //retrofit instance.
    @ApiAnnotation
    @Provides
    fun provide_Retrofit_Instance() = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(AppConstant.BASE_URL)
        .build()
        .create(ValorantApiService::class.java)

    @ApiAnnotation
    @Provides
    fun provide_MMO_Retrofit_Instance() = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
        .baseUrl(AppConstant.MMO_BASE_URL)
        .build()
        .create(MMOApiService::class.java)
}