package com.example.cus02demo.data.model

data class EstadoSolicitud(
    val data: List<EstadoSolicitudItems> = emptyList(),
    val message: String = "",
    val status: Int = 0
)