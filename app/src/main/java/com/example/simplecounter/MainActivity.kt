package com.example.simplecounter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var counter = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonCounterAdd)
        val textView = findViewById<TextView>(R.id.counterNum)
        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()
        }
    }
}