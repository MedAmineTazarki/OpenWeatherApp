package com.tazarki.openweather.di

import com.tazarki.openweather.data.local.WeatherDatabase
import com.tazarki.openweather.data.repositories.WeatherRepository
import com.tazarki.openweather.data.service.WeatherInterface
import com.tazarki.openweather.ui.viewmodel.WeatherViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityRetainedComponent::class)
object WeatherModule {

    @Provides
    fun provideWeatherViewModel(repository: WeatherRepository) = WeatherViewModel(repository)

    @Provides
    fun provideWeatherRepository(service: WeatherInterface, db: WeatherDatabase) = WeatherRepository(service,db)

    @Provides
    fun provideWeatherInterface(retrofit: Retrofit) = retrofit.create(WeatherInterface::class.java)

}