package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonContinueForgotPassword.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            if (email.isNotEmpty()) {
                // Lanjutkan ke aktivitas CheckMailActivity
                val intent = Intent(this, CheckMailActivity::class.java)
                startActivity(intent)
            } else {
                // Tampilkan pesan kesalahan jika email kosong
                binding.editTextEmail.error = "Please enter your email"
            }
        }
    }
}
