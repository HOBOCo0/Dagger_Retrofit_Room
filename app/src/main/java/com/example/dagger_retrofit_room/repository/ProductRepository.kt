package com.example.dagger_retrofit_room.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dagger_retrofit_room.model.Product
import com.example.dagger_retrofit_room.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI){

    private val _products = MutableLiveData<List<Product>>()
     val product:LiveData<List<Product>>
         get() = _products
    suspend fun getproducts(){
        val result = fakerAPI.getProducts()
        if(result.isSuccessful && result.body()!= null){
            _products.postValue(result.body())
        }
    }
}