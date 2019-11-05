package com.example.madlibscs315

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)
        val editText5 = findViewById<EditText>(R.id.editText5)
        val editText6 = findViewById<EditText>(R.id.editText6)
        val editText7 = findViewById<EditText>(R.id.editText7)
        val editText8 = findViewById<EditText>(R.id.editText8)
        val message1 = editText.text.toString()
        val message2 = editText2.text.toString()
        val message3 = editText3.text.toString()
        val message4 = editText4.text.toString()
        val message5 = editText5.text.toString()
        val message6 = editText6.text.toString()
        val message7 = editText7.text.toString()
        val message8 = editText8.text.toString()
        val intent = Intent(this, DisplayMadLibs::class.java).apply {

            putExtra("EXTRA_MESSAGE", message1)
            putExtra("EXTRA_MESSAGE2", message2)
            putExtra("EXTRA_MESSAGE3", message3)
            putExtra("EXTRA_MESSAGE4", message4)
            putExtra("EXTRA_MESSAGE5", message5)
            putExtra("EXTRA_MESSAGE6", message6)
            putExtra("EXTRA_MESSAGE7", message7)
            putExtra("EXTRA_MESSAGE8", message8)

        }
        startActivity(intent)
    }
}
