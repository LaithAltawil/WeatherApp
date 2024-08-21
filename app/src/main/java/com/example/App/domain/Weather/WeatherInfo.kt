package com.example.App.domain.Weather

data class WeatherInfo(
    val weatherDataPerDay : Map<Int,List<WeatherData>>,
    val currentWeatherData : WeatherData?

)

