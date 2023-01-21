package com.example.geekjokes.presentation.Utils

import androidx.recyclerview.widget.DiffUtil
import com.example.geekjokes.model.Event

class DiffCallBack: DiffUtil.ItemCallback<Event>() {
    override fun areItemsTheSame(oldItem: Event, newItem: Event): Boolean {
        return oldItem.type == newItem.type
    }

    override fun areContentsTheSame(oldItem: Event, newItem: Event): Boolean {
        return oldItem == newItem
    }
}