package com.example.amangeldi_abdibaitov_mo5_hw_2.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.amangeldi_abdibaitov_mo5_hw_2.MainActivity
import com.example.amangeldi_abdibaitov_mo5_hw_2.R
import com.example.amangeldi_abdibaitov_mo5_hw_2.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private lateinit var binding: FragmentResultBinding
    private lateinit var viewModel: ResultViewModel

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)
        viewModel = (activity as MainActivity).viewModel

        viewModel.resultLiveData.observe(viewLifecycleOwner) { response ->
            binding.percentage.text = response.percentage + " %"
            binding.result.text = response.result

        }
    }
}