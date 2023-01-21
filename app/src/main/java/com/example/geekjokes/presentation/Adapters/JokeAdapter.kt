package com.example.geekjokes.presentation.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.geekjokes.databinding.RecyclerEventItemBinding
import com.example.geekjokes.model.Event
import com.example.geekjokes.presentation.Utils.DiffCallBack

class JokeAdapter() : ListAdapter<Event, JokeAdapter.JokeViewHolder>(DiffCallBack())  {

    val listStart = emptyList<Event>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeAdapter.JokeViewHolder {
        val binding = (RecyclerEventItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))
        return JokeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.binding.tvTypeEvent.text = listStart[position].toString()
        holder.binding.tvLink.text = listStart[position].toString()
        holder.binding.tvSetupActivity.text = listStart[position].toString()
    }

    override fun getItemCount(): Int {
        return listStart.size
    }
    inner class JokeViewHolder(val binding:RecyclerEventItemBinding) : RecyclerView.ViewHolder(binding.root)
}