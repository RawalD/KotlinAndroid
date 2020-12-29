package com.diprawal.kotlinfunfacts

import android.graphics.Color
import kotlin.random.Random

class BackgroundColours {
    val colours = arrayOf(
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d"
    )

    fun getColours():Int {

        val randomColour = Random.nextInt(colours.size)
        val colourAsInt = Color.parseColor(colours[randomColour])
        return colourAsInt
    }
}


