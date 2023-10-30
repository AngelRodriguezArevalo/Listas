package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listas.adapter.FilmAdapter
import com.example.listas.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)

        val binding = ActivityMainBinding.inflate( layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        //binding.recycler.layoutManager = GridLayoutManager(this, 2)
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
        //binding.recycler.addItemDecoration(decoration)

    }
}