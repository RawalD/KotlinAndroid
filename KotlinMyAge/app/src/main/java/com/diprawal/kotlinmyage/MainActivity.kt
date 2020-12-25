package com.diprawal.kotlinmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalc.setOnClickListener {
            //Execute when clicked
            val year = yearOfBirth.text.toString().toInt()
            val age = 2020 - year
            ageResult.text = "Your Age Is ${age}"
        }
    }
}