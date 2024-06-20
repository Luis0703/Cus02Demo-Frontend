package com.example.cus02demo.network
import com.example.cus02demo.data.model.ConteoEstadoSolicitud
import com.example.cus02demo.data.model.EstadoSolicitud
import com.example.cus02demo.data.model.SolicitudesEstado
import retrofit2.http.GET


interface ApiService {

    @GET("/estado_solicitud")
    suspend fun listEstadoSolicitudApiService(): EstadoSolicitud

    @GET("/conteo_estado_solicitud")
    suspend fun listConteoEstadoSolicitudApiService(): ConteoEstadoSolicitud

    @GET("/solicitudes_estado")
    suspend fun listSolcitudesEstadoApiService(): SolicitudesEstado

}
