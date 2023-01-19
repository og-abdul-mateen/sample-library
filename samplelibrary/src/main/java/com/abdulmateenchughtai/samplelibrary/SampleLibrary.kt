package com.abdulmateenchughtai.samplelibrary

import android.app.Application
import android.util.Log

class SampleLibrary private constructor(
    private val application: Application,
    private val onInitialized: () -> Unit
) {
    private fun initializeLibrary() {
        Log.d(TAG, "Initializing SampleLibrary...")
        onInitialized()
    }

    companion object {
        private var instance: SampleLibrary? = null
        internal const val TAG = "SampleLibraryTag"

        fun initialize(
            application: Application,
            onInitialized: () -> Unit
        ) {
            instance = SampleLibrary(application, onInitialized)
            instance?.initializeLibrary()
        }
    }
}