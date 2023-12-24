package com.example.amangeldi_abdibaitov_mo5_hw_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.amangeldi_abdibaitov_mo5_hw_2.databinding.ActivityMainBinding
import com.example.amangeldi_abdibaitov_mo5_hw_2.repository.ResultRepository
import com.example.amangeldi_abdibaitov_mo5_hw_2.ui.fragment.ResultViewModel
import com.example.amangeldi_abdibaitov_mo5_hw_2.ui.fragment.ViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    lateinit var viewModel: ResultViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultRepository = ResultRepository()
        val resultViewModelProviderFactory = ViewModelProviderFactory(resultRepository)
        viewModel =
            ViewModelProvider(this, resultViewModelProviderFactory)[ResultViewModel::class.java]

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as? NavHostFragment
        navController = navHostFragment?.findNavController()!!

    }
}