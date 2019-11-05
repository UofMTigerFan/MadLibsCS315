package com.example.madlibscs315

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMadLibs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_mad_libs)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val message2 = intent.getStringExtra("EXTRA_MESSAGE2")
        val message3 = intent.getStringExtra("EXTRA_MESSAGE3")
        val message4 = intent.getStringExtra("EXTRA_MESSAGE4")
        val message5 = intent.getStringExtra("EXTRA_MESSAGE5")
        val message6 = intent.getStringExtra("EXTRA_MESSAGE6")
        val message7 = intent.getStringExtra("EXTRA_MESSAGE7")
        val message8 = intent.getStringExtra("EXTRA_MESSAGE8")

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        val textView2 = findViewById<TextView>(R.id.textView3).apply {
            text = message2
        }
        val textView3= findViewById<TextView>(R.id.textView5).apply {
            text = message3
        }
        val textView4 = findViewById<TextView>(R.id.textView7).apply {
            text = message4
        }
        val textView5 = findViewById<TextView>(R.id.textView9).apply {
            text = message5
        }
        val textView6 = findViewById<TextView>(R.id.textView11).apply {
            text = message6
        }
        val textView7 = findViewById<TextView>(R.id.textView13).apply {
            text = message7
        }
        val textView8 = findViewById<TextView>(R.id.textView15).apply {
            text = message8
        }
    }
}
