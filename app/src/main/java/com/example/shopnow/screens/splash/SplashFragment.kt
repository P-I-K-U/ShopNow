package com.example.shopnow.screens.splash

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.graphics.green
import androidx.navigation.fragment.findNavController
import com.example.shopnow.R
import com.example.shopnow.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

     private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        Handler().postDelayed( {
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_landingFragment)
            }

        }, 1880)


        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    private fun onBoardingFinished() : Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }
}


