package com.example.App.Data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name="hourly")
    val WeatherData: WeatherDataDto
)
