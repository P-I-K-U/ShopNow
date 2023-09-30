package com.example.shopnow.screens.landing

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shopnow.databinding.FragmentLandingBinding
import com.example.shopnow.screens.landing.adapter.ViewPagerAdapter
import com.example.shopnow.screens.landing.onboardingscreens.FirstFragment
import com.example.shopnow.screens.landing.onboardingscreens.SecondFragment
import com.example.shopnow.screens.landing.onboardingscreens.ThirdFragment


class LandingFragment : Fragment() {

    private lateinit var binding: FragmentLandingBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        requireActivity().window.statusBarColor = Color.WHITE
        binding = FragmentLandingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter




    }

}
