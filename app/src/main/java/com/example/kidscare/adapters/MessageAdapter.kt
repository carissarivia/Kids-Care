package com.example.kidscare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidscare.databinding.ItemMessagesBinding

data class Message(val name: String, val description: String, val time: String, val unreadCount: Int, val imageResId: Int)

class MessageAdapter(private val messages: List<Message>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(val binding: ItemMessagesBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = ItemMessagesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MessageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        holder.binding.messageUserName.text = message.name
        holder.binding.messageDescription.text = message.description
        holder.binding.messageTime.text = message.time
        holder.binding.messageUnreadCount.text = message.unreadCount.toString()
        holder.binding.messageUserImage.setImageResource(message.imageResId)
    }

    override fun getItemCount(): Int {
        return messages.size
    }
}
