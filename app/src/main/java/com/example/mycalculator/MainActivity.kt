package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Number buttons variables
        val btnZero: Button = findViewById(R.id.btnZero)
        val btnOne: Button = findViewById(R.id.btnOne)
        val btnTwo: Button = findViewById(R.id.btnTwo)
        val btnThree: Button = findViewById(R.id.btnThree)
        val btnFour: Button = findViewById(R.id.btnFour)
        val btnFive: Button = findViewById(R.id.btnFive)
        val btnSix: Button = findViewById(R.id.btnSix)
        val btnSeven: Button = findViewById(R.id.btnSeven)
        val btnEight: Button = findViewById(R.id.btnEight)
        val btnNine: Button = findViewById(R.id.btnNine)

        // Operator buttons variables
        val btnDivide: Button = findViewById(R.id.btnDivide)
        val btnMultiply: Button = findViewById(R.id.btnMultiply)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)

        // System buttons variables
        val btnClear: Button = findViewById(R.id.btnClear)
        val btnEqual: Button = findViewById(R.id.btnEqual)

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Number buttons events
        btnZero.setOnClickListener { test() }
        btnOne.setOnClickListener { test() }
        btnTwo.setOnClickListener { test() }
        btnThree.setOnClickListener { test() }
        btnFour.setOnClickListener { test() }
        btnFive.setOnClickListener { test() }
        btnSix.setOnClickListener { test() }
        btnSeven.setOnClickListener { test() }
        btnEight.setOnClickListener { test() }
        btnNine.setOnClickListener { test() }

        // Operator buttons events
        btnDivide.setOnClickListener { test() }
        btnMultiply.setOnClickListener { test() }
        btnMinus.setOnClickListener { test() }
        btnPlus.setOnClickListener { test() }

        // System buttons variables
        btnClear.setOnClickListener { test() }
        btnEqual.setOnClickListener { test() }
    }

    private fun test() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
    }
}