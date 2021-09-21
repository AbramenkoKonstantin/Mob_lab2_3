package com.example.lab2_3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.blackText).setOnClickListener{
            findViewById<EditText>(R.id.text).setTextColor(Color.BLACK)
        }

        findViewById<Button>(R.id.redText).setOnClickListener{
            findViewById<EditText>(R.id.text).setTextColor(Color.RED)
        }

        findViewById<Button>(R.id.size8).setOnClickListener{
            findViewById<EditText>(R.id.text).setTextSize(8F)
        }

        findViewById<Button>(R.id.size24).setOnClickListener{
            findViewById<EditText>(R.id.text).setTextSize(24F)
        }

        findViewById<Button>(R.id.whiteBg).setOnClickListener{
            findViewById<EditText>(R.id.text).setBackgroundColor(Color.WHITE)
        }

        findViewById<Button>(R.id.yellowBg).setOnClickListener{
            findViewById<EditText>(R.id.text).setBackgroundColor(Color.YELLOW)
        }
    }
}