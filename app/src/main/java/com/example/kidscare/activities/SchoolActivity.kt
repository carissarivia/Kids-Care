package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.R
import com.example.kidscare.databinding.ActivitySchoolBinding

class SchoolActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySchoolBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySchoolBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back Button
        binding.backButton.setOnClickListener {
            finish()
        }

        // Bottom Navigation
        binding.bottomNavigationView.selectedItemId = -1 // No item selected
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_news -> {
                    val intent = Intent(this, ArticleActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_messages -> {
                    val intent = Intent(this, MessagesActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        binding.schoolImage2.setOnClickListener {
            val intent = Intent(this, SchoolDetailActivity::class.java)
            startActivity(intent)
        }
    }
}
