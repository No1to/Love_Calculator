package com.example.amangeldi_abdibaitov_mo5_hw_2.network

import com.example.amangeldi_abdibaitov_mo5_hw_2.model.LoveModel
import com.example.amangeldi_abdibaitov_mo5_hw_2.utils.Constants.Companion.API_KEY
import com.example.amangeldi_abdibaitov_mo5_hw_2.utils.Constants.Companion.HOST
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface LoveAPI {

    @Headers("X-RapidAPI-Key: $API_KEY ", "X-RapidAPI-Host: $HOST ")
    @GET("getPercentage")
    suspend fun getResult(
        @Query("fname") yourName: String,
        @Query("sname") partnerName: String
    ): LoveModel
}