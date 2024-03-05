package com.example.lec4demo2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MySongAdapter (
    val songList : List<Song>,
    val context : Context
    ) : RecyclerView.Adapter<MySongAdapter.MySongViewHolder>() {

        class MySongViewHolder(view : View) : RecyclerView.ViewHolder(view) {
            val imageId : ImageView = view.findViewById(R.id.imageId)
            val songNameText : TextView = view.findViewById(R.id.songNameText)
            val artistNameText : TextView = view.findViewById(R.id.artistNameText)
            val albumNameText : TextView = view.findViewById(R.id.albumNameText)

            val button : Button = view.findViewById(R.id.button)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MySongViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.song_cell, parent, false)
            return MySongViewHolder(view)
        }

        override fun onBindViewHolder(holder: MySongViewHolder, position: Int) {
            val song : Song = songList[position]
            holder.imageId.setImageResource(song.songImageId)
            holder.songNameText.text = song.songName
            holder.artistNameText.text = song.artistName
            holder.albumNameText.text = song.albumName

            holder.button.setOnClickListener {
                Toast.makeText(context, "Song's name is: " + song.songName, Toast.LENGTH_SHORT).show()
            }
        }

        override fun getItemCount(): Int {
            return songList.size
        }
    }
