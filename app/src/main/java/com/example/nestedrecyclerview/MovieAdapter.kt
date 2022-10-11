package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.databinding.MovieItemBinding

class MovieAdapter( var movies: ArrayList<MovieModel>):RecyclerView.Adapter<MovieHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : MovieItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.movie_item,parent,false)
        return MovieHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.bind(movies[position], movies)
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}

class MovieHolder(val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(movieModel:MovieModel, action: ArrayList<MovieModel>){

        binding.contentCardMovie.setBackgroundResource(movieModel.banerMovie)
        binding.nameMovie.text = movieModel.nameMovie
        binding.longMovie.text = movieModel.longMovie
        binding.actorsMovie.text = movieModel.actorsMovie
        binding.ratingMovie.text = movieModel.ratingMovie



    }

}