package com.example.App.di

import com.example.App.Data.location.DefaultLocationTracker
import com.example.App.domain.Location.LocationTracker
import com.example.App.domain.repo.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: DefaultLocationTracker
    ): WeatherRepository

}