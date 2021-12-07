package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dice.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root)
        supportActionBar?.hide()

        binding.button5.setOnClickListener {
          //  Toast.makeText(this,"Do it again",Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt =  (Random().nextInt(6) + 1)
        binding.textId.text = randomInt.toString()
       /* if (binding.textId.text.toString() == getString(R.string.hello_world)) {

            binding.textId.text = randomInt.toString()
        } else {
            binding.textId.text = getString(R.string.hello_world)
        } */

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.dice.setImageResource(drawableResource)
    }
}