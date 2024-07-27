package com.example.kidscare.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.R
import com.example.kidscare.databinding.ActivityFoodBinding

class FoodActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back button click listener
        binding.backButton.setOnClickListener {
            finish() // Go back to the previous activity
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

        // Set content for each recipe
        setupRecipes()
    }

    private fun setupRecipes() {
        // Set the first recipe details
        binding.recipeImage1.setImageResource(R.drawable.ic_recipe_image_1)
        binding.tvRecipeCategory1.text = getString(R.string.healthy_kitchen)
        binding.tvRecipeTitle1.text = getString(R.string.baked_honey_mustard_chicken)
        binding.tvRecipeRatings1.text = getString(R.string.recipe_ratings)

        // Set the second recipe details
        binding.recipeImage2.setImageResource(R.drawable.ic_recipe_image_2)
        binding.tvRecipeCategory2.text = getString(R.string.fruit_fillings)
        binding.tvRecipeTitle2.text = getString(R.string.strawberry_pie_filling)
        binding.tvRecipeRatings2.text = getString(R.string.recipe_ratings)

        // Set the third recipe details
        binding.recipeImage3.setImageResource(R.drawable.ic_recipe_image_3)
        binding.tvRecipeCategory3.text = getString(R.string.fruit_fillings)
        binding.tvRecipeTitle3.text = getString(R.string.fruit_salad)
        binding.tvRecipeRatings3.text = getString(R.string.recipe_ratings)

        binding.recipeImage1.setOnClickListener {
            val intent = Intent(this, FoodDetailActivity::class.java)
            startActivity(intent)
        }
    }
}
