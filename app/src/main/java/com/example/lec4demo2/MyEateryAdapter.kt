package com.example.lec4demo2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyEateryAdapter(
    val eateryList : List<Eatery>,
    val context : Context
) : RecyclerView.Adapter<MyEateryAdapter.MyEateryViewHolder>() {

    class MyEateryViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val nameText : TextView = view.findViewById(R.id.songNameText)
        val locText : TextView = view.findViewById(R.id.artistNameText)
        val button : Button = view.findViewById(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyEateryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.eatery_cell, parent, false)
        return MyEateryViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyEateryViewHolder, position: Int) {
        val eatery : Eatery = eateryList[position]
        holder.nameText.text = eatery.name
        holder.locText.text = eatery.location

        holder.button.setOnClickListener {
            Toast.makeText(context, "Eatery's name is: " + eatery.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return eateryList.size
    }
}