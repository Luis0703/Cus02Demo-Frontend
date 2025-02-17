package com.example.cus02demo.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cus02demo.data.uistate.SearchUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SolicitudViewModel : ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _searchWidgetState = MutableStateFlow(value = SearchUiState.CLOSED)
    val searchWidgetState = _searchWidgetState.asStateFlow()

    fun updateSearchWidgetState(newValue: SearchUiState) {
        _searchWidgetState.value = newValue
    }

    fun updateSearchTextState(newValue: String) {
        _searchText.value = newValue
    }

    fun updateIsLoadingSearch(value: Boolean) {
        _isLoading.value = value
    }

}