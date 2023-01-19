package com.example.geekjokes.presentation.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.geekjokes.databinding.ProgJokeItemBinding
import com.example.geekjokes.model.JokeItem
import com.example.geekjokes.presentation.Utils.DiffCallBack

class JokeAdapter(private val names: List<String>) : ListAdapter<JokeItem, JokeAdapter.JokeViewHolder>(DiffCallBack())  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeAdapter.JokeViewHolder {
        val binding = (ProgJokeItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))
        return JokeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.binding.tvTypeJoke.text = names[position]
        holder.binding.tvSetupJoke.text = names[position]
        holder.binding.tvJokePunchline.text = names[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }
    inner class JokeViewHolder(val binding:ProgJokeItemBinding) : RecyclerView.ViewHolder(binding.root)
}