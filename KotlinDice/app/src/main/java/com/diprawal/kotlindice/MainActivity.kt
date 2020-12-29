package com.diprawal.kotlindice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var diceViewOne: ImageView
    lateinit var diceViewTwo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceViewOne = findViewById(R.id.dice_view)
        diceViewTwo = findViewById(R.id.dice_view_2)
        val rollButton: Button = findViewById(R.id.rollBtn)

        rollButton.setOnClickListener {
            rollDice()
        }

    }

    fun rollDice(){


        val randomNumber = (1..6).random()
        val randomNumberTwo = (1..6).random()

        val image = when(randomNumber){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }

        val imageTwo = when(randomNumberTwo){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }

        diceViewOne.setImageResource(image)
        diceViewTwo.setImageResource(imageTwo)
    }
}