package com.tazarki.openweather.data.repositories

import com.tazarki.openweather.data.local.Location
import com.tazarki.openweather.data.local.WeatherDatabase
import com.tazarki.openweather.data.model.WeatherResponse
import com.tazarki.openweather.data.service.WeatherInterface
import javax.inject.Inject

/**
 * class to access data from different data source.
 */
class WeatherRepository @Inject constructor(
    private val service: WeatherInterface, private val db: WeatherDatabase) {

    suspend fun getCityWeather(city: String): WeatherResponse {
        return service.getCityWeather(city)
    }

    suspend fun getAllBookmarkLocation(): List<String> {
        return db.locationDao().getAllBookmarkLocation()
    }

    suspend fun addToBookMark(location: Location): Long {
        return db.locationDao().insertLocation(location)
    }

    suspend fun removeFromBookMark(location: Location): Int {
        return db.locationDao().removeFromBookMark(location)
    }

    suspend fun isBookMarkPresent(id: Int): Boolean {
        return db.locationDao().isBookMarkPresent(id)
    }
}