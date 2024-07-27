package com.example.kidscare.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.databinding.ActivityFoodDetailBinding

class FoodDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFoodDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up back button
        binding.backButton.setOnClickListener {
            finish()
        }

        // Add other setup code if needed
    }
}
