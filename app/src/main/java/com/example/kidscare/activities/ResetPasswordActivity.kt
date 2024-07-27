package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.databinding.ActivityResetPasswordBinding

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonContinueResetPassword.setOnClickListener {
            val password = binding.editTextPassword.text.toString()
            if (password.isNotEmpty()) {
                // Implementasikan logika untuk mengatur ulang kata sandi

                // Kembali ke halaman sign in
                val intent = Intent(this, LandingActivity::class.java)
                intent.putExtra("navigateTo", "SignIn")
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()
            } else {
                // Tampilkan pesan kesalahan jika password kosong
                binding.editTextPassword.error = "Please enter your new password"
            }
        }
    }
}
