package com.example.carolytracker.navigation

import androidx.navigation.NavController
import com.example.core.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}