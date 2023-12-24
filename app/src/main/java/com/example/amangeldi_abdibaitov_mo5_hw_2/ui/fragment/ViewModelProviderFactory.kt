package com.example.amangeldi_abdibaitov_mo5_hw_2.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.amangeldi_abdibaitov_mo5_hw_2.repository.ResultRepository

class ViewModelProviderFactory(
    val resultRepository: ResultRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ResultViewModel(resultRepository) as T
    }
}