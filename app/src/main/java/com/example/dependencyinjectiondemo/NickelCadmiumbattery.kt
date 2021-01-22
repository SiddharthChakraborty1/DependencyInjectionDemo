package com.example.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG","Battery power available")
    }
}