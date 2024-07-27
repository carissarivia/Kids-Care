package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidscare.R
import com.example.kidscare.adapters.ArticleAdapter
import com.example.kidscare.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Dummy data for RecyclerView
        val articleTitles = listOf(
            getString(R.string.double_prohe_mpas),
            getString(R.string.makanan_pengganti_daging),
            getString(R.string.larangan_cuci_daging)
        )

        val articleDescriptions = listOf(
            getString(R.string.double_prohe_mpas_description),
            getString(R.string.makanan_pengganti_daging_description),
            getString(R.string.larangan_cuci_daging_description)
        )

        val articleImages = listOf(
            R.drawable.ic_article_image,
            R.drawable.ic_article_image,
            R.drawable.ic_article_image
        )

        binding.popularRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.popularRecyclerView.adapter = ArticleAdapter(articleTitles, articleDescriptions, articleImages)

        // Bottom Navigation
        binding.bottomNavigationView.selectedItemId = R.id.navigation_news
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_news -> true
                R.id.navigation_messages -> {
                    // Implement message navigation
                    val intent = Intent(this, MessagesActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_profile -> {
                    // Implement profile navigation
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        binding.backButton.setOnClickListener {
            finish()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
