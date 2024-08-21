package com.example.App.domain.repo

import com.example.App.domain.Weather.WeatherInfo
import com.example.App.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat:Double,long:Double):Resource<WeatherInfo>


}