package com.bestamibakir.knowledgeexercises

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bestamibakir.knowledgeexercises.databinding.RecyclerRowBinding
import java.util.Objects

class FilmAdapter(val filmListesi : ArrayList<Film>) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){
    class FilmViewHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return filmListesi.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}