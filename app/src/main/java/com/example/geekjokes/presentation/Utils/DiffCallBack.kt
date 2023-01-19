package com.example.geekjokes.presentation.Utils

import androidx.recyclerview.widget.DiffUtil
import com.example.geekjokes.model.JokeItem

class DiffCallBack: DiffUtil.ItemCallback<JokeItem>() {
    override fun areItemsTheSame(oldItem: JokeItem, newItem: JokeItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: JokeItem, newItem: JokeItem): Boolean {
        return oldItem == newItem
    }
}