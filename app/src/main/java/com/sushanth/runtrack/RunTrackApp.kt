package com.sushanth.runtrack

import android.app.Application
import com.sushanth.runtrack.core.tracking.notification.NotificationHelper
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class RunTrackApp : Application() {
    @Inject
    lateinit var notificationHelper: NotificationHelper
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        notificationHelper.createNotificationChannel()
    }
}