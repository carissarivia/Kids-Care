package com.example.kidscare.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kidscare.fragments.LandingPage1Fragment
import com.example.kidscare.fragments.LandingPage2Fragment
import com.example.kidscare.fragments.LandingPage3Fragment
import com.example.kidscare.fragments.SignInFragment
import com.example.kidscare.fragments.SignUpFragment

class LandingPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 5 // Tambahkan halaman SignUpFragment
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> LandingPage1Fragment()
            1 -> LandingPage2Fragment()
            2 -> LandingPage3Fragment()
            3 -> SignInFragment()
            4 -> SignUpFragment()
            else -> LandingPage1Fragment()
        }
    }
}
