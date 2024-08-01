package com.example.dagger_retrofit_room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dagger_retrofit_room.model.Product

@Database(entities = [Product::class], version = 1 )
abstract class FakerDB: RoomDatabase(){
    abstract fun getFakerDAO(): FakerDAO
}