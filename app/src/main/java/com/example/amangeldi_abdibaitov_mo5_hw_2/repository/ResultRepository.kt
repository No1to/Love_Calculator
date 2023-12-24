package com.example.amangeldi_abdibaitov_mo5_hw_2.repository

import com.example.amangeldi_abdibaitov_mo5_hw_2.network.RetrofitInstance

class ResultRepository {
    suspend fun getResult(yourName: String, partnerName: String) =
        RetrofitInstance.loveAPI.getResult(yourName, partnerName)
}