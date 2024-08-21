package com.example.App.Data.location

import android.app.Application
import android.location.Location
import com.example.App.domain.Location.LocationTracker
import com.google.android.gms.location.FusedLocationProviderClient
import javax.inject.Inject

class DefaultLocationTracker @Inject constructor(
    private val locationClient: FusedLocationProviderClient,
    private val application: Application
):LocationTracker {

    override suspend fun getCurrentLocation(): Location? {
        TODO("Not yet implemented")
    }
}