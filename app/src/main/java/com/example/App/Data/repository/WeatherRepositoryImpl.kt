package com.example.App.Data.repository

import com.example.App.Data.mappers.toWeatherInfo
import com.example.App.Data.remote.WeatherApi
import com.example.App.domain.Weather.WeatherInfo
import com.example.App.domain.repo.WeatherRepository
import com.example.App.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    latitude = lat,
                    longitude = long
                ).toWeatherInfo()
            )


        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")

        }
    }


}