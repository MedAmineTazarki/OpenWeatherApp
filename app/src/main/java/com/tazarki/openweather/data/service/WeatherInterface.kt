package com.tazarki.openweather.data.service

import com.tazarki.openweather.utils.API_KEY
import com.tazarki.openweather.utils.UNIT
import com.tazarki.openweather.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * interface to have rest api call
 */
interface WeatherInterface {

    @GET("weather")
    suspend fun getCityWeather(
        @Query("q") q: String,
        @Query("units") units: String = UNIT,
        @Query("appid") appid: String = API_KEY
    ): WeatherResponse
}