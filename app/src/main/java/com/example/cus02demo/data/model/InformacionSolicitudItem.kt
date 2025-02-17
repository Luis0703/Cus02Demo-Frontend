package com.example.cus02demo.data.model

data class InformacionSolicitudItem(
    val Nombre: String ="",
    val area_predio: String ="",
    val cantidad_areas_comunes: Int,
    val fecha_solicitud: String,
    val id_area_comun: Int,
    val id_persona: Int,
    val id_predio: String,
    val id_predio_area_comun: Int,
    val id_solicitante: String,
    val id_solicitud: String,
    val numero_casas: Int,
    val numero_solicitud: Int,
    val predio: String,
    val servicio_solicitado: String
)