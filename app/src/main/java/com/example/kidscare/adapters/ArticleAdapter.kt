package com.example.kidscare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidscare.databinding.ItemArticleBinding

class ArticleAdapter(
    private val titles: List<String>,
    private val descriptions: List<String>,
    private val imageResIds: List<Int>
) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(val binding: ItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding =
            ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.binding.articleTitle.text = titles[position]
        holder.binding.articleDescription.text = descriptions[position]
        holder.binding.articleImage.setImageResource(imageResIds[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}
