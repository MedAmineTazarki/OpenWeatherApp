package com.tazarki.openweather

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class OpenWeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}