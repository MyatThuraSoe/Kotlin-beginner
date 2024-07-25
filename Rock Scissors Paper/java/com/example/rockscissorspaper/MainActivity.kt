package com.example.rockscissorspaper

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val player1Image: ImageView = findViewById(R.id.imageView1)
        val player2Image: ImageView = findViewById(R.id.imageView2)
        val resultTextView: TextView = findViewById(R.id.tv_winner)

        val playButton: Button = findViewById(R.id.btn_play)

        val options = arrayOf("rock", "paper", "scissors")

        var player1pick: String
        var player2pick: String
        playButton.setOnClickListener {
            player1pick = options.random()
            player2pick = options.random()

            when(player1pick){
                "rock"->player1Image.setImageResource(R.drawable.rock_color)
                "paper"->player1Image.setImageResource(R.drawable.paper_color)
                "scissors"->player1Image.setImageResource(R.drawable.scissors_color)
            }
            when(player2pick){
                "rock"->player2Image.setImageResource(R.drawable.rock_color)
                "paper"->player2Image.setImageResource(R.drawable.paper_color)
                "scissors"->player2Image.setImageResource(R.drawable.scissors_color)
            }

            if(player1pick == player2pick)
            {
                resultTextView.text = "Game is Draw!"
            }else if( (player1pick=="rock" && player2pick=="scissors") ||
                (player1pick=="scissors" && player2pick=="paper") ||
                (player1pick=="paper" && player2pick=="rock"))
            {
                resultTextView.text = "Winner is Player 1!"
            }else{
                resultTextView.text = "Winner is Player 2!"
            }

        }

    }
}