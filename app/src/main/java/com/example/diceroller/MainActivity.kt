package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var result_image : ImageView;
    lateinit var  score : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        score  = findViewById(R.id.scoreValue)
        result_image = findViewById(R.id.resultImage)
        val roll_dice : Button = findViewById(R.id.rollDice)
        roll_dice.setOnClickListener {
            rollDiceFun();
        }

    }
    private fun rollDiceFun() {
        val randomNum = (1..6).random();
        when(randomNum)
        {
            1 -> result_image.setImageResource(R.drawable.dice_1)
            2 -> result_image.setImageResource(R.drawable.dice_2)
            3 -> result_image.setImageResource(R.drawable.dice_3)
            4 -> result_image.setImageResource(R.drawable.dice_4)
            5 -> result_image.setImageResource(R.drawable.dice_5)
            6 -> result_image.setImageResource(R.drawable.dice_6)
        }
        score.text = randomNum.toString()
    }
}