package com.example.App.Data

data class Hourly(
    val relative_humidity_2m: List<Int>,
    val temperature_2m: List<Double>,
    val time: List<String>
)