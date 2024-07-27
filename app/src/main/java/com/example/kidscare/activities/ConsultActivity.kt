package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidscare.R
import com.example.kidscare.adapters.ExpertAdapter
import com.example.kidscare.databinding.ActivityConsultBinding

data class Expert(
    val name: String,
    val specialty: String,
    val rating: String,
    val price: String,
    val discountPrice: String,
    val imageResId: Int
)

class ConsultActivity : AppCompatActivity(), ExpertAdapter.OnItemClickListener {

    private lateinit var binding: ActivityConsultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup RecyclerView
        val experts = listOf(
            Expert(
                name = getString(R.string.dr_wanitha),
                specialty = getString(R.string.specialist_child),
                rating = getString(R.string.rating),
                price = getString(R.string.price),
                discountPrice = getString(R.string.discount_price),
                imageResId = R.drawable.ic_doctor_image
            ),
            Expert(
                name = getString(R.string.dr_roger),
                specialty = getString(R.string.general_practitioner),
                rating = getString(R.string.rating),
                price = getString(R.string.price),
                discountPrice = getString(R.string.discount_price),
                imageResId = R.drawable.ic_doctor_image
            )
        )

        binding.rvExperts.layoutManager = LinearLayoutManager(this)
        binding.rvExperts.adapter = ExpertAdapter(experts, this)

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

        // Back Button
        binding.backButton.setOnClickListener {
            finish()
        }
    }

    override fun onItemClick(expert: Expert) {
        val intent = Intent(this, PaymentDetailActivity::class.java).apply {
            putExtra("EXPERT_NAME", expert.name)
            putExtra("EXPERT_SPECIALTY", expert.specialty)
            putExtra("EXPERT_IMAGE", expert.imageResId)
            putExtra("EXPERT_PRICE", expert.price)
            putExtra("EXPERT_DISCOUNT_PRICE", expert.discountPrice)
        }
        startActivity(intent)
    }
}
