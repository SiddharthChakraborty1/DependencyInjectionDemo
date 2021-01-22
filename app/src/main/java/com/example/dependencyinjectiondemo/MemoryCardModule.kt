package com.example.dependencyinjectiondemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val size: Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard{
        Log.i("MYTAG","Memory card size is $size")
        return MemoryCard()
    }
}