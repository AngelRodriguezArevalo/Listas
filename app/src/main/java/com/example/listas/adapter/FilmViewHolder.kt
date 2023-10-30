package com.example.listas.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listas.Film
import com.example.listas.databinding.ItemFilmBinding

class FilmViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemFilmBinding.bind(view)
    fun render(filModel: Film){
        binding.FilmName.text = filModel.title
        binding.FilmDirector.text = filModel.director
        binding.FilmYear.text = filModel.year.toString()
        Glide.with(binding.FilmPhoto.context).load(filModel.photo).into(binding.FilmPhoto)

        // evento de hacer click sobre la imagen de la pelicula
        binding.FilmPhoto.setOnClickListener{
            Toast.makeText(binding.FilmPhoto.context, filModel.director, Toast.LENGTH_LONG).show()
        }

        // evento de hacer click sobre toda la pelicula
        itemView.setOnClickListener {
            Toast.makeText(binding.FilmPhoto.context, filModel.title, Toast.LENGTH_LONG).show()
        }
    }
}