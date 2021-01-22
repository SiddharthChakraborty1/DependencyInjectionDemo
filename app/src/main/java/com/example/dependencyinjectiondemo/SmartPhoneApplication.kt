package com.example.dependencyinjectiondemo

import android.app.Application

class SmartPhoneApplication: Application() {

    lateinit var smartphoneComponent: SmartphoneComponent

    override fun onCreate() {
        super.onCreate()
        smartphoneComponent = initDagger()

    }

    private fun initDagger(): SmartphoneComponent =
        DaggerSmartphoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()

}