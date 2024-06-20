package com.example.cus02demo.data.repository

import com.example.cus02demo.data.model.SolicitudesEstado
import com.example.cus02demo.network.ApiInstance

class SolicitudesEstadoRepository {

    private val service = ApiInstance.apiInstance

    suspend fun getSolicitudesEstadoRepository() : Result<SolicitudesEstado>{
        return try {
            val response = service.listSolcitudesEstadoApiService()
            println("getSolicitudesEstadoRepository"+ response)
            Result.success(response)
        }catch (e: Exception){
            Result.failure(e)
        }
    }

}