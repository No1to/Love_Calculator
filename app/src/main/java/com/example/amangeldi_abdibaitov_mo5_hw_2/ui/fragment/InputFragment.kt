package com.example.amangeldi_abdibaitov_mo5_hw_2.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.amangeldi_abdibaitov_mo5_hw_2.MainActivity
import com.example.amangeldi_abdibaitov_mo5_hw_2.R
import com.example.amangeldi_abdibaitov_mo5_hw_2.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private lateinit var binding: FragmentInputBinding
    private lateinit var viewModel: ResultViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInputBinding.bind(view)
        viewModel = (activity as MainActivity).viewModel

        binding.submit.setOnClickListener {
            viewModel.getResult(
                binding.edYourName.text.toString(),
                binding.edPartnerName.text.toString()
            )
            findNavController().navigate(R.id.action_inputFragment_to_resultFragment)
        }
    }
}