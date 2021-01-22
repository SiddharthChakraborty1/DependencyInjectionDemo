package com.example.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    companion object{
        fun getServiceProvider(){
            Log.i("MYTAG","The service Provider returned")
        }
    }
    init {
        Log.i("MYTAG","Service provider created")
    }


}