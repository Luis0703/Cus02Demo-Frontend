package com.example.cus02demo.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cus02demo.data.uistate.TrackingUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class OrderViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(TrackingUiState())
    val uiState: StateFlow<TrackingUiState> = _uiState.asStateFlow()

    /* recuperar datos de la base de datos */
}