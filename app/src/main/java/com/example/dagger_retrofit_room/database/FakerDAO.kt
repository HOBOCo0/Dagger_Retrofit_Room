package com.example.dagger_retrofit_room.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.dagger_retrofit_room.model.Product


@Dao
interface FakerDAO {
    @Insert
    suspend fun addProducts(products: List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts():List<Product>
}