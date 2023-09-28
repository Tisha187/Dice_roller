package com.codewithharry.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button)
        button1.setOnClickListener{ rolldice()
                    }
    }

    private fun rolldice() {        // uses the dice class as an object to display the text on the textview
        var myfirstdice=dice(6)
        val image1: ImageView =findViewById(R.id.dice1)
        val diceroll=myfirstdice.roll()
        var diceno= when(diceroll){
            1->(R.drawable.dice_1)
            2->(R.drawable.dice_2)
            3->(R.drawable.dice_3)
            4->(R.drawable.dice_4)
            5->(R.drawable.dice_5)
            else -> R.drawable.dice_6
        }
       image1.setImageResource(diceno)




    }

}

class dice(private val numsides:Int){
    // Generates  a Random number
    fun roll():Int {
        return (1..numsides).random()
    }
}