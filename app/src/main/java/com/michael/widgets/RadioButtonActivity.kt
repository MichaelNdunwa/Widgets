package com.michael.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.google.android.material.snackbar.Snackbar

class RadioButtonActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        radioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            radioButton = findViewById(checkedId)

            when (radioButton.id) {
                R.id.yesRadioButton -> showSnackBar("Lover boy 😍, congratulations though 🥳")
                R.id.noRadioButton -> showSnackBar("Oga go and find a girlfriend.")
                R.id.maybeRadioButton -> showSnackBar("Oga talk joor, who is she?")
            }
        }
    }

    private fun showSnackBar(message: String) {
        Snackbar.make(radioGroup, message, Snackbar.LENGTH_SHORT).show()
    }
}