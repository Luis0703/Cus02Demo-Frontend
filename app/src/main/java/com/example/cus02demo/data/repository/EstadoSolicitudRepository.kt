package com.example.cus02demo.data.repository

import com.example.cus02demo.data.model.ConteoEstadoSolicitud
import com.example.cus02demo.data.model.EstadoSolicitud
import com.example.cus02demo.network.ApiInstance

class EstadoSolicitudRepository {

    private val service = ApiInstance.apiInstance

    suspend fun getEstadoSolicitudRepository() : Result<EstadoSolicitud>{
        return try {
            val response = service.listEstadoSolicitudApiService()
            Result.success(response)
        }catch (e: Exception){
            Result.failure(e)
        }
    }

    suspend fun getConteoEstadoSolicitudRepository() : Result<ConteoEstadoSolicitud>{
        return try {
            val response = service.listConteoEstadoSolicitudApiService()
            Result.success(response)
        }catch (e: Exception){
            Result.failure(e)
        }
    }

}