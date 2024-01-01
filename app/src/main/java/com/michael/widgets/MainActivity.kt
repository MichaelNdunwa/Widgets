package com.michael.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.michael.widgets.RadioButtonActivity as RadioButtonActivity1

class MainActivity : AppCompatActivity() {

    private lateinit var radioButton: Button
    private lateinit var seekBar: Button
    private lateinit var toggleButton: Button
    private lateinit var checkBox: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButton = findViewById(R.id.radioButton)
        seekBar = findViewById(R.id.seekBar)
        toggleButton = findViewById(R.id.toggleButton)
        checkBox = findViewById(R.id.checkBox)


        /* radioButton.setOnClickListener {
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
     }*/
        radioButton.setOnClickListener { explicitIntent(RadioButtonActivity1::class.java) }
        seekBar.setOnClickListener { explicitIntent(SeekBarActivity::class.java) }
        toggleButton.setOnClickListener { explicitIntent(ToggleButtonActivity::class.java) }
        checkBox.setOnClickListener { explicitIntent(CheckBoxActivity::class.java) }
    }

    private fun explicitIntent(classes: Class<*>) {
        val explicitIntent = Intent(this, classes)
        startActivity(explicitIntent)
    }

}