package com.example.dagger_retrofit_room

import android.app.Application
import com.example.dagger_retrofit_room.di.ApplicationComponent
import com.example.dagger_retrofit_room.di.DaggerApplicationComponent

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}