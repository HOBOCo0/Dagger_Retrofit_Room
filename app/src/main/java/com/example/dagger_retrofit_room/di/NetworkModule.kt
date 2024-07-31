package com.example.dagger_retrofit_room.di

import com.example.dagger_retrofit_room.retrofit.FakerAPI
import com.example.dagger_retrofit_room.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun providesFakerAPI(retrofit: Retrofit): FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}