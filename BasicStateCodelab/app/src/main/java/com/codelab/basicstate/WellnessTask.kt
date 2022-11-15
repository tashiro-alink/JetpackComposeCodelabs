package com.codelab.basicstate

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf

class WellnessTask(
    val id: Int,
    val label: String,
    val initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)
}