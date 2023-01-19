package com.example.geekjokes.presentation.Utils

import androidx.recyclerview.widget.DiffUtil
import com.example.geekjokes.model.JokeItem

class DiffUtils(val oldList: List<JokeItem>, val newList:List<JokeItem>): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

}