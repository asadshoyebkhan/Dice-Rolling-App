package com.example.dicerolling

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener{
            roll()
        }
    }

    private fun roll()
    {
        var random_no = (1..6).random()
        var imageDice:Int =0

        when (random_no)
        {
            1 -> {
                imageDice=R.drawable.dice_1
            }
            2 -> {
                imageDice=R.drawable.dice_2
            }
            3 -> {
                imageDice=R.drawable.dice_3
            }
            4 -> {
                imageDice=R.drawable.dice_4
            }
            5 -> {
                imageDice=R.drawable.dice_5
            }
            6 -> {
                imageDice=R.drawable.dice_6
            }
        }

        imageView.setImageResource(imageDice)
        Toast.makeText(this,"Dice is Rolled",Toast.LENGTH_LONG).show()

    }
}