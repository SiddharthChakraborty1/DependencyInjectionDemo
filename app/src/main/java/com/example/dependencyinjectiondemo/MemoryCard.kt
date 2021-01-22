package com.example.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject

class MemoryCard{

    init {
        Log.i("MYTAG","MemoryCard constructed")
    }

    fun getSpaceAvailability(){
        Log.i("MYTAG","Memory space available")
    }

}