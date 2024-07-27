package com.example.kidscare.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.kidscare.adapters.LandingPagerAdapter
import com.example.kidscare.databinding.ActivityLandingBinding

class LandingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = LandingPagerAdapter(this)
        binding.viewPager.adapter = adapter

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == adapter.itemCount - 1) {
                    // Disable swiping after reaching the SignIn page
                    binding.viewPager.isUserInputEnabled = false
                }
            }
        })

        // Cek apakah ada instruksi untuk menavigasi langsung ke halaman sign in
        val navigateTo = intent.getStringExtra("navigateTo")
        if (navigateTo == "SignIn") {
            binding.viewPager.currentItem = 3 // Indeks halaman sign in
        }
    }

    fun navigateToSignUp() {
        binding.viewPager.currentItem = 4 // Indeks halaman sign up
    }

    fun navigateToSignIn() {
        binding.viewPager.currentItem = 3 // Indeks halaman sign in
    }
}
