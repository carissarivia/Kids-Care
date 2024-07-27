package com.example.kidscare.adapters

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidscare.databinding.ItemExpertBinding
import com.example.kidscare.activities.Expert

class ExpertAdapter(
    private val experts: List<Expert>,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<ExpertAdapter.ExpertViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(expert: Expert)
    }

    inner class ExpertViewHolder(val binding: ItemExpertBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    itemClickListener.onItemClick(experts[position])
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpertViewHolder {
        val binding = ItemExpertBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExpertViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExpertViewHolder, position: Int) {
        val expert = experts[position]
        holder.binding.expertImage.setImageResource(expert.imageResId)
        holder.binding.expertName.text = expert.name
        holder.binding.expertSpecialty.text = expert.specialty
        holder.binding.expertRating.text = expert.rating
        holder.binding.expertPrice.text = expert.price
        holder.binding.expertDiscountPrice.text = expert.discountPrice
        holder.binding.expertDiscountPrice.paintFlags = holder.binding.expertDiscountPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
    }

    override fun getItemCount(): Int {
        return experts.size
    }
}
