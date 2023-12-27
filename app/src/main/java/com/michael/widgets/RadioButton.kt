package com.michael.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import com.google.android.material.snackbar.Snackbar

class RadioButton : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        radioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            radioButton = findViewById(checkedId)

            when (radioButton.id) {
                R.id.yesRadioButton -> { Snackbar.make(this, "Lover boy 😍, congratulations though 🥳", Snackbar.LENGTH_SHORT).show() }
            }
        }
    }
}