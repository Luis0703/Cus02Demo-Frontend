package com.example.cus02demo.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance {

    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl("https://sigcon-mbackend-cus02.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiInstance by lazy{
        retrofit.create(ApiService::class.java)
    }

}