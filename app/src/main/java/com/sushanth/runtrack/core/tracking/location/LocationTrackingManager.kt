package com.sushanth.runtrack.core.tracking.location

import com.google.android.gms.location.LocationCallback

interface LocationTrackingManager {
    fun registerCallback(locationCallback: LocationCallback)

    fun unRegisterCallback(locationCallback: LocationCallback)
}