package com.example.geekjokes

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.geekjokes.presentation.Adapters.JokeAdapter
import com.example.geekjokes.presentation.MainActivityViewModel

class Fragment_list : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter:JokeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        recyclerView = view.findViewById(R.id.rv_jokes)
        adapter = JokeAdapter()
        recyclerView.adapter = adapter

        viewModel.loadJoke()
        viewModel.listJokes.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.submitList(it) }
        }
        return view
    }
}