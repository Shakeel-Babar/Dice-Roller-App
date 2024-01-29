package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var rollbutton : Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener {

          rollDice() //this is a user defined method and we invoked / called here

        }

    
    }
    
    
    


    private fun rollDice() {

        val randomInt = Random().nextInt(6 + 1)  //here we called predefined method  'Random'

      val drawableResource =  when (randomInt){   // when is similar to c/c++ Switch Statement

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

          else -> R.drawable.dice_6
      }

       val diceImage: ImageView = findViewById(R.id.dice_image)

            diceImage.setImageResource(drawableResource) //setImageResource is used to set the images
    }
}