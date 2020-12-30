package com.diprawal.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {

    var lastNumeric: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDigit(view: View){
    input.append(((view as Button).text))
    lastNumeric = true

    }

    fun onClear(view: View){
        lastDot = false
        lastNumeric = false
        input.text = ""

    }

    fun onDecimal(view: View){
        if (lastNumeric && !lastDot){
            input.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onOperator(view: View){
        if (lastNumeric && !isOperatoAdded(input.text.toString())){
            input.append((view as Button).text)
            lastNumeric = false
            lastDot = false
        }
    }

    fun onEqual(view:View){
        if(lastNumeric){
            var inputValue = input.text.toString()

            try {

                if(inputValue.contains("-")){
                    val splitValue = inputValue.split("-")

                    var one = splitValue[0].toDouble()
                    var two = splitValue [1].toDouble()

                    var subtraction = one - two
                    input.text = subtraction.toString()


                } else if (inputValue.contains("+")){
                    val splitValue = inputValue.split("+")

                    var one = splitValue[0].toDouble()
                    var two = splitValue [1].toDouble()

                    var addition = one + two
                    input.text = addition.toString()
                }
                else if (inputValue.contains("/")){
                    val splitValue = inputValue.split("/")

                    var one = splitValue[0].toDouble()
                    var two = splitValue [1].toDouble()

                    var division = one / two
                    input.text = division.toString()
                }
                else if (inputValue.contains("*")){
                    val splitValue = inputValue.split("*")

                    var one = splitValue[0].toDouble()
                    var two = splitValue [1].toDouble()

                    var multi = one * two
                    input.text = multi.toString()
                }

            }catch(e: ArithmeticException){
                e.printStackTrace()
            }
        }
    }

    private fun isOperatoAdded(value: String): Boolean{
        return if (value.startsWith("-")){
            false
        }else{
            value.contains("/") || value.contains("*") ||
                    value.contains("/") || value.contains("-") ||
                    value.contains("+")
        }
    }
}