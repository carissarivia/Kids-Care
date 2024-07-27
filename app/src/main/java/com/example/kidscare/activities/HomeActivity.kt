package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.R
import com.example.kidscare.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hide action bar
        supportActionBar?.hide()

        // Setup BottomNavigationView
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle home navigation
                    true
                }
                R.id.navigation_news -> {
                    // Navigate to ArticleActivity
                    val intent = Intent(this, ArticleActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_messages -> {
                    // Handle messages navigation
                    val intent = Intent(this, MessagesActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_profile -> {
                    // Handle profile navigation
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        binding.iconBell.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        // Setup click listener for the Consult image
        binding.categoryConsult.setOnClickListener {
            val intent = Intent(this, ConsultActivity::class.java)
            startActivity(intent)
        }

        binding.categoryHealth.setOnClickListener {
            val intent = Intent(this, HealthActivity::class.java)
            startActivity(intent)
        }

        binding.categoryFood.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }

        binding.categorySchool.setOnClickListener {
            val intent = Intent(this, SchoolActivity::class.java)
            startActivity(intent)
        }

        binding.newbornsImage.setOnClickListener {
            val intent = Intent(this, DetailNewbornsActivity::class.java)
            startActivity(intent)
        }

        binding.consultWithExpert.setOnClickListener {
            val intent = Intent(this, ConsultActivity::class.java)
            startActivity(intent)
        }

        binding.mentalHealth.setOnClickListener {
            val intent = Intent(this, HealthActivity::class.java)
            startActivity(intent)
        }
    }
}
