package com.example.kidscare.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.R
import com.example.kidscare.databinding.ActivitySchoolDetailBinding

class SchoolDetailActivity : AppCompatActivity() {
    private var binding: ActivitySchoolDetailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySchoolDetailBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())

        // Set school details
        binding!!.tvSchoolName.text = getString(R.string.phillips_exeter_academy)
        binding!!.tvSchoolSubtitle.text = getString(R.string.best_high_school)
        binding!!.tvRatings.text = getString(R.string.ratings)

        // Back button listener
        binding!!.backButton.setOnClickListener { view -> finish() }
    }
}
