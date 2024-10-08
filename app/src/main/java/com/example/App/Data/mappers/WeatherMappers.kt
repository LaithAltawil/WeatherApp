package com.example.App.Data.mappers

import com.example.App.Data.remote.WeatherDataDto
import com.example.App.Data.remote.WeatherDto
import com.example.App.domain.Weather.WeatherData
import com.example.App.domain.Weather.WeatherInfo
import com.example.App.domain.Weather.WeatherType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class IndexedWeatherData(
    val index: Int,
    val data: WeatherData
)

fun WeatherDataDto.toWeatherDataMap(): Map<Int, List<WeatherData>> {
    return time.mapIndexed { index, time ->
        val temperature = temperatures[index]
        val weatherCode = weatherCodes[index]
        val windSpeed = windSpeeds[index]
        val pressure = pressures[index]
        val humidity = humidity[index]
        IndexedWeatherData(
            index = index, data = WeatherData(
                time = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME),
                temperatureCelcius = temperature,
                pressure = pressure,
                windSpeed = windSpeed,
                humidity = humidity,
                weatherType = WeatherType.fromWMO(weatherCode)
            )
        )
    }.groupBy {
        it.index / 24
    }.mapValues {
        it.value.map { it.data }
    }}

fun WeatherDto.toWeatherInfo(): WeatherInfo {
    val weatherDataMap=WeatherData.toWeatherDataMap()
    val now= LocalDateTime.now()
    val currentWeatherData=weatherDataMap[0]?.find{
        val hour = if(now.minute<30) now.hour else now.hour+1
        it.time.hour==hour
    }
   return WeatherInfo(
       weatherDataPerDay = weatherDataMap,
       currentWeatherData = currentWeatherData
   )

}



