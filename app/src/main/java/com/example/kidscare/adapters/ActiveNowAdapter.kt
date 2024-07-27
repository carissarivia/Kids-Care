package com.example.kidscare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidscare.databinding.ItemActiveNowBinding

data class ActiveUser(val name: String, val imageResId: Int)

class ActiveNowAdapter(private val users: List<ActiveUser>) :
    RecyclerView.Adapter<ActiveNowAdapter.ActiveNowViewHolder>() {

    inner class ActiveNowViewHolder(val binding: ItemActiveNowBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActiveNowViewHolder {
        val binding = ItemActiveNowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ActiveNowViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ActiveNowViewHolder, position: Int) {
        val user = users[position]
        holder.binding.activeUserName.text = user.name
        holder.binding.activeUserImage.setImageResource(user.imageResId)
    }

    override fun getItemCount(): Int {
        return users.size
    }
}
