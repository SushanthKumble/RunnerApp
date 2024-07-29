package com.sushanth.runtrack.ui.common.extension

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.sushanth.runtrack.ui.nav.BottomNavDestination

fun NavController.navigateToBottomNavDestination(item: BottomNavDestination) {
    navigate(item.route) {
        popUpTo(graph.findStartDestination().id) {
            this.saveState = true
        }
        restoreState = true
        launchSingleTop = true
    }
}