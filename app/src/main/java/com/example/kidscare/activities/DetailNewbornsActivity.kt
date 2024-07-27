package com.example.kidscare.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.R
import com.example.kidscare.databinding.ActivityDetailNewbornsBinding

class DetailNewbornsActivity : AppCompatActivity() {
    private var binding: ActivityDetailNewbornsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewbornsBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())

        // Back button functionality
        binding!!.backButton.setOnClickListener { v -> finish() }

        // Set content
        binding!!.tvNewbornTitle.text = getString(R.string.newborns)
        binding!!.tvNewbornSubtitle.text = getString(R.string.age_0_3_months)
        binding!!.tvShare.text = getString(R.string.share)
        binding!!.tvBehaviourTitle.text = getString(R.string.behaviour)
        binding!!.tvBehaviourDescription.text = getString(R.string.behaviour_description)
        binding!!.tvHealthyDailyCareTitle.text = getString(R.string.healthy_daily_care)
        binding!!.tvHealthyDailyCareDescription.text =
            getString(R.string.healthy_daily_care_description)
    }
}
