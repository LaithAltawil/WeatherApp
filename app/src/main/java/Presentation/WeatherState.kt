package Presentation

import com.example.App.domain.Weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo?=null,
    val isLoading:Boolean=false,
    val error:String?=null

)
