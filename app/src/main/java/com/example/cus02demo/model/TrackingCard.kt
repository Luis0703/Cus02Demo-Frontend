package com.example.cus02demo.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import com.example.cus02demo.data.model.ConteoEstadoSolicitud
import com.example.cus02demo.data.model.ConteoEstadoSolicitudItem
import com.example.cus02demo.data.model.EstadoSolicitudItems

data class TrackingCard(
    @DrawableRes val imageRes: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
    val conteoSolicitudItems: ConteoEstadoSolicitudItem
)
