package com.diprawal.kotlinfunfacts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    //FactBook class
    private val factNook = FactBook()
    private val backgroundColours = BackgroundColours()

    //Declare views
    private var facts: TextView? = null
    private  var factButton: Button? = null
    private  var changeBackground: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Assign views
        facts = findViewById(R.id.facts)
        factButton = findViewById(R.id.factButton)
        changeBackground = findViewById(R.id.factAppLayout)


        factButton!!.setOnClickListener {

            //Change fact on display
            facts!!.text = factNook.getFact()
            //Change background on display
            changeBackground!!.setBackgroundColor(backgroundColours.getColours())

        }
    }
}