package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Initialize the dice value variable
    private var diceValue = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button and TextView elements from the layout
        val rollButton = findViewById<Button>(R.id.roll_dice)
        val resultTextView = findViewById<TextView>(R.id.textview_result)

        // Initialize the TextView with the initial dice value
        resultTextView.text = diceValue.toString()
    }

    // Method to handle dice rolling
    fun rollingDice() {
        // Generate a random value between 1 and 6
        diceValue = Random.nextInt(1, 7)

        // Display the result in the TextView
        val resultTextView = findViewById<TextView>(R.id.textview_result)
        resultTextView.text = diceValue.toString()
    }
}
