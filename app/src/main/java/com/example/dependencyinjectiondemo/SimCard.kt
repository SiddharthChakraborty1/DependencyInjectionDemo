package com.example.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {

    init {
        Log.i("MYTAG","SimCard constructed")
    }

    fun getConnection(){
        ServiceProvider.getServiceProvider()
    }


}