package com.example.App.domain.Location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?


}