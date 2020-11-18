package com.naren.ktdiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var ivRoll: ImageView
    lateinit var ivRoll2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivRoll = findViewById(R.id.ivRoll)
        ivRoll2 = findViewById(R.id.ivRoll2)

        val rollBtn: Button = findViewById(R.id.btnRoll)

        rollBtn.setOnClickListener {
            diceRoll()
        }
        val resetBtn: Button = findViewById(R.id.btnReset)

        resetBtn.setOnClickListener {
            ivRoll.setImageResource(R.drawable.empty_dice)
            ivRoll2.setImageResource(R.drawable.empty_dice)
        }

    }

    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun diceRoll() {
        ivRoll.setImageResource(getRandomDiceImage())
        ivRoll2.setImageResource(getRandomDiceImage())
    }

}