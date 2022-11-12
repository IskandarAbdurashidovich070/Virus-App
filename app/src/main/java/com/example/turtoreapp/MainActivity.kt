package com.example.turtoreapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.Runnable

class MainActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    private lateinit var mediaPlayer:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         mediaPlayer = MediaPlayer.create(this, R.raw.audio)

        handler = Handler(Looper.getMainLooper())

        handler.postDelayed(runnable, 100)

    }


    private val runnable = object : Runnable{
        override fun run() {
            handler.postDelayed(this, 100)
            finish()
            mediaPlayer.start()
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }

    }

}