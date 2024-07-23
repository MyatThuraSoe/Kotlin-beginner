package com.example.dicerollapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_Roller:Button=findViewById(R.id.random_btn)
        btn_Roller.setOnClickListener{
            val randomNo1 = (1 .. 6).random()
            val randomNo2 = (1 .. 6).random()
            var sum = randomNo1 + randomNo2
            val textview_sum: TextView =findViewById(R.id.tv_sum)
            textview_sum.text=sum.toString()
            val dice_image1:ImageView=findViewById(R.id.imageView1)
            when(randomNo1){
                1->dice_image1.setImageResource(R.drawable.dice_1)
                2->dice_image1.setImageResource(R.drawable.dice_2)
                3->dice_image1.setImageResource(R.drawable.dice_3)
                4->dice_image1.setImageResource(R.drawable.dice_4)
                5->dice_image1.setImageResource(R.drawable.dice_5)
                6->dice_image1.setImageResource(R.drawable.dice_6)

            }
            val dice_image2:ImageView=findViewById(R.id.imageView2)
            when(randomNo2){
                1->dice_image2.setImageResource(R.drawable.dice_1)
                2->dice_image2.setImageResource(R.drawable.dice_2)
                3->dice_image2.setImageResource(R.drawable.dice_3)
                4->dice_image2.setImageResource(R.drawable.dice_4)
                5->dice_image2.setImageResource(R.drawable.dice_5)
                6->dice_image2.setImageResource(R.drawable.dice_6)

            }

        }


    }
}
