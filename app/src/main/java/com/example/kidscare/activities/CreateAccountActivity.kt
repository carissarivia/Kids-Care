package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.kidscare.R
import com.example.kidscare.fragments.SignInFragment

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sign_up)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val tvSignInPrompt = findViewById<TextView>(R.id.tvSignInPrompt)

        btnSignUp.setOnClickListener {
            // Logika untuk sign up
        }

        tvSignInPrompt.setOnClickListener {
            val intent = Intent(this, SignInFragment::class.java)
            startActivity(intent)
        }
    }
}
