package com.tazarki.openweather.di

import com.tazarki.openweather.data.service.APIManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityRetainedComponent::class)
object NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit = APIManager.getInstance().retrofit

}