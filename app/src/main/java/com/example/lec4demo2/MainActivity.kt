package com.example.lec4demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val exampleEateryList = listOf(
//            Eatery(name = "Okenshields", location="Central"),
//            Eatery(name = "Morrison", location="North"),
//            Eatery(name = "Bethe", location="West"),
//            Eatery(name = "Okenshields", location="Central"),
//            Eatery(name = "Morrison", location="North"),
//            Eatery(name = "Bethe", location="West"),
//            Eatery(name = "Okenshields", location="Central"),
//            Eatery(name = "Morrison", location="North"),
//            Eatery(name = "Bethe", location="West"),
//            Eatery(name = "Okenshields", location="Central"),
//            Eatery(name = "Morrison", location="North"),
//            Eatery(name = "Bethe", location="West"),
//            Eatery(name = "Okenshields", location="Central"),
//            Eatery(name = "Morrison", location="North"),
//            Eatery(name = "Bethe", location="West"),
//            Eatery(name = "Okenshields", location="Central"),
//            Eatery(name = "Morrison", location="North"),
//            Eatery(name = "Bethe", location="West"),
//        )

        val exampleSongList = listOf(
            Song(songImageId = R.drawable.strobe, songName = "Strobe", artistName = "deadmau5", albumName = "For Lack of a Better Name"),
            Song(songImageId = R.drawable.supersonic, songName = "Supersonic", artistName = "Joshwa", albumName = "Bass Go Boom")
        )


        val recyclerView : RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MySongAdapter(exampleSongList, this)

    }
}