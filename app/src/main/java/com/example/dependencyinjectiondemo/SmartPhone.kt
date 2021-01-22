package com.example.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(val battery: Battery, val simCard: SimCard, val memoryCard: MemoryCard) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i("MYTAG","SmartPhone constructed")
    }
    fun makeCallWithRecording()
    {
        Log.i("MYTAG", "Calling...")
    }


}

