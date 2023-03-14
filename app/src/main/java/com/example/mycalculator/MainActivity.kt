package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Text View of input variable
    private lateinit var tvInput: TextView
    private var lastNumeric = false
    private var lastDot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)

        // Number buttons variable
        val numberButtons = arrayOf(
            findViewById<Button>(R.id.btnZero),
            findViewById(R.id.btnOne),
            findViewById(R.id.btnTwo),
            findViewById(R.id.btnThree),
            findViewById(R.id.btnFour),
            findViewById(R.id.btnFive),
            findViewById(R.id.btnSix),
            findViewById(R.id.btnSeven),
            findViewById(R.id.btnEight),
            findViewById(R.id.btnNine)
        )


        numberButtons.forEach { lol ->
            lol.setOnClickListener {
                tvInput.append(lol.text)
                lastNumeric = true
            }
        }

        // Operator buttons variable
        val operatorButtons = arrayOf(
            findViewById<Button>(R.id.btnDivide),
            findViewById(R.id.btnMultiply),
            findViewById(R.id.btnMinus),
            findViewById(R.id.btnPlus)
        )

        operatorButtons.forEach { button ->
            button.setOnClickListener {
                performOperation()
            }
        }

        val btnDot = findViewById<Button>(R.id.btnDot)
        btnDot.setOnClickListener {
            onDecimalPoint()
        }

        // System buttons variables
        val btnClear = findViewById<Button>(R.id.btnClear)
        btnClear.setOnClickListener {
            tvInput.text = ""
        }

        val btnEqual = findViewById<Button>(R.id.btnEqual)
        btnEqual.setOnClickListener {
            calculateResult()
        }
    }

    // Function to process the operation
    private fun performOperation() {

    }

    // Function to perform the equality operation
    private fun calculateResult() {

    }

    private fun onDecimalPoint() {
        if (lastNumeric && !lastDot) {
            tvInput.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}