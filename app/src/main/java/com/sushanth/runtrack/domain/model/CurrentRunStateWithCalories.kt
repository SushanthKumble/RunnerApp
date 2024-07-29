package com.sushanth.runtrack.domain.model

import com.sushanth.runtrack.core.tracking.model.CurrentRunState

data class CurrentRunStateWithCalories(
    val currentRunState: CurrentRunState = CurrentRunState(),
    val caloriesBurnt: Int = 0
)