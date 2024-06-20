package com.example.cus02demo.domain

import com.example.cus02demo.data.model.ConteoEstadoSolicitud
import com.example.cus02demo.data.model.EstadoSolicitud
import com.example.cus02demo.data.repository.EstadoSolicitudRepository

class EstadoSolicitudUseCase {

    private val repository = EstadoSolicitudRepository()

    suspend fun getEstadoSolicitudUC(): Result<EstadoSolicitud> {
        return repository.getEstadoSolicitudRepository()
    }

    suspend fun getConteoEstadoSolicitudUC(): Result<ConteoEstadoSolicitud> {
        return repository.getConteoEstadoSolicitudRepository()
    }

}