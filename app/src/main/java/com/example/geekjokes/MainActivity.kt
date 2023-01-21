package com.example.geekjokes
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

import com.example.geekjokes.databinding.ActivityMainBinding

import com.example.geekjokes.presentation.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        setOnClickGenerate()
        setOnClickOpenLink()
    }

    private fun setOnClickGenerate() {
        binding.buttonGenerate.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentById(R.id.containerFragment2)
           if (fragment != null) {
               supportFragmentManager
                   .beginTransaction()
                   .add(R.id.containerFragment2, fragment)
                   .commit()
           }
        }
    }

    private fun setOnClickOpenLink() {
        binding.buttonOpenLink.setOnClickListener{
                val intent = viewModel.openLink()
                startActivity(intent)
            }
        }
}