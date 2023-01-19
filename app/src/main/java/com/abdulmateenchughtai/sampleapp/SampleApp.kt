package com.abdulmateenchughtai.sampleapp

import android.app.Application
import android.util.Log
import com.abdulmateenchughtai.samplelibrary.SampleLibrary

class SampleApp: Application() {
    private val TAG = "SampleAppTag"

    override fun onCreate() {
        super.onCreate()

        initializeSampleLibrary()
    }

    private fun initializeSampleLibrary() {
        SampleLibrary.initialize(
            this,
            ::onSampleLibraryInitialized
        )
    }

    private fun onSampleLibraryInitialized() {
        Log.d(TAG, "SampleLibrary has been initialized")
    }
}