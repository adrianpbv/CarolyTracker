package com.example.core.utils

import android.content.Context

sealed class UiEvent {
    data class Navigate(val route: String): UiEvent()
    object NavigateUp: UiEvent()
    data class ShowSnackBar(val  message: UiText) : UiEvent()
}
