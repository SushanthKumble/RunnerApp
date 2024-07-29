package com.sushanth.runtrack.ui.screen.home

import com.sushanth.runtrack.core.data.model.Run
import com.sushanth.runtrack.core.data.model.User
import com.sushanth.runtrack.domain.model.CurrentRunStateWithCalories

data class HomeScreenState(
    val runList: List<Run> = emptyList(),
    val currentRunStateWithCalories: CurrentRunStateWithCalories = CurrentRunStateWithCalories(),
    val currentRunInfo: Run? = null,
    val user: User = User(),
    val distanceCoveredInKmInThisWeek: Float = 0.0f
)
