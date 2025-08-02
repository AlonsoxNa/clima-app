package com.alonso.climaapp.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import com.alonso.climaapp.model.ClimaResponse
import com.alonso.climaapp.model.PronosticoResponse

interface ClimaApiService {
    @GET("weather")
        suspend fun getClimaPorCiudad(
        @Query("q") ciudad: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
        @Query("lang") lang: String = "es"
        ): Response<ClimaResponse>

        @GET("forecast")
        suspend fun getPronosticoPorCiudad(
            @Query("q") ciudad: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
            @Query("lang") lang: String = "es"
        ): Response<PronosticoResponse>
}