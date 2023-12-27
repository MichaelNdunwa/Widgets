package com.michael.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var radioButton: Button
    private lateinit var seekBar: Button
    private lateinit var toggleButton: Button
    private lateinit var checkBox1: Button
    private lateinit var checkBox2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButton = findViewById(R.id.radioButton)
        seekBar = findViewById(R.id.seekBar)
        toggleButton = findViewById(R.id.toggleButton)
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)


        radioButton.setOnClickListener {
            val explicitIntent = Intent(this, RadioButtonActivity::class.java)
            startActivity(explicitIntent)
        }
        seekBar.setOnClickListener {
            val explicitIntent = Intent(this, Seek_Bar::class.java)
            startActivity(explicitIntent)
        }
        toggleButton.setOnClickListener {
            val explicitIntent = Intent(this, Toggle_Button::class.java)
            startActivity(explicitIntent)
        }
        checkBox1.setOnClickListener {
            val explicitIntent = Intent(this, CheckBox1::class.java)
            startActivity(explicitIntent)
        }
        checkBox2.setOnClickListener {
            val explicitIntent = Intent(this, CheckBox2::class.java)
            startActivity(explicitIntent)
        }
    }

}