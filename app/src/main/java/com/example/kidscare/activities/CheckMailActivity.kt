package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.databinding.ActivityCheckMailBinding

class CheckMailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckMailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckMailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonContinueCheckMail.setOnClickListener {
            // Lanjutkan ke aktivitas ResetPasswordActivity
            val intent = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}
