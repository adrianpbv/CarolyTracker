package com.example.carolytracker.navigation

import androidx.navigation.NavController
import com.example.core.utils.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}