package com.example.App.domain.Weather

import java.time.LocalDateTime

data class WeatherData(
    val time:LocalDateTime,
    val temperatureCelcius:Double,
    val pressure:Double,
    val windSpeed:Double,
    val humidity:Double,
    val weatherType:WeatherType
)
