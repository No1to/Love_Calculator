package com.example.amangeldi_abdibaitov_mo5_hw_2.ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amangeldi_abdibaitov_mo5_hw_2.model.LoveModel
import com.example.amangeldi_abdibaitov_mo5_hw_2.repository.ResultRepository
import kotlinx.coroutines.launch

class ResultViewModel(
    private val resultRepository: ResultRepository
) : ViewModel() {

    val resultLiveData = MutableLiveData<LoveModel>()

    fun getResult(yourName: String, partnerName: String) = viewModelScope.launch {
        val response = resultRepository.getResult(yourName, partnerName)
        resultLiveData.postValue(response)
    }
}