package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidscare.R
import com.example.kidscare.adapters.ActiveNowAdapter
import com.example.kidscare.adapters.ActiveUser
import com.example.kidscare.adapters.Message
import com.example.kidscare.adapters.MessageAdapter
import com.example.kidscare.databinding.ActivityMessagesBinding

class MessagesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Dummy data for Active Now and Messages RecyclerViews
        val activeUsers = listOf(
            ActiveUser("Dr. Wanitha", R.drawable.ic_doctor),
            ActiveUser("Dr. Upul", R.drawable.ic_doctor),
            ActiveUser("Dr. Nadine", R.drawable.ic_doctor)
        )

        val messages = listOf(
            Message("Dr. Wanitha", "Worem consectetur adipiscing elit.", "12:50", 2, R.drawable.ic_user),
            Message("Dr. Upul", "Worem consectetur adipiscing elit.", "12:50", 2, R.drawable.ic_user),
            Message("Dr. Upul", "Worem consectetur adipiscing elit.", "12:50", 2, R.drawable.ic_user)
        )

        // Setup Active Now RecyclerView
        binding.activeNowRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.activeNowRecyclerView.adapter = ActiveNowAdapter(activeUsers)

        // Setup Messages RecyclerView
        binding.messagesRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.messagesRecyclerView.adapter = MessageAdapter(messages)

        // Bottom Navigation
        binding.bottomNavigationView.selectedItemId = R.id.navigation_messages
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
                R.id.navigation_messages -> true
                R.id.navigation_profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        // Back Button
        binding.backButton.setOnClickListener {
            finish()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
