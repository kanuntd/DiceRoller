package buu.informatics.s59161081.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { rollReset() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"



    }
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
    private fun rollReset(){
        val resetInt = 0
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = resetInt.toString()
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }


}
