package com.example.cus02demo.domain

import com.example.cus02demo.data.model.SolicitudesEstado
import com.example.cus02demo.data.repository.SolicitudesEstadoRepository

class SolicitudesEstadoUseCase {

    private val repository = SolicitudesEstadoRepository()

    suspend fun getSolicitudEstadoPendienteUC(): Result<SolicitudesEstado> {
        return repository.getSolicitudesEstadoRepository()
    }

}