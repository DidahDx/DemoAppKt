package com.didahdx.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var button_switch : MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: MaterialButton = findViewById(R.id.btn_material)
        button_switch=findViewById(R.id.btn_switch)
        btnRoll.setOnClickListener {
            rollDice()
        }

        btn_switch.setOnClickListener{
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }

    private fun rollDice() {
        Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show()
        val randomInt=(1..6).random()
        val diceImage=when(randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else-> R.drawable.empty_dice
        }

        image_view.setImageResource(diceImage)
        image_view2.setImageResource(getImage())
    }

    private fun getImage(): Int {
        val randomInt=(1..6).random()
        return when(randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else-> R.drawable.empty_dice
        }
    }
}
