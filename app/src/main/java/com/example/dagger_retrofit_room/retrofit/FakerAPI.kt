package com.example.dagger_retrofit_room.retrofit

import com.example.dagger_retrofit_room.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts():Response<List<Product>>
}