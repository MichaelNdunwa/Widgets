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
                R.id.yesRadioButton -> Snackbar.make(radioButton, "Lover boy 😍, congratulations though 🥳", Snackbar.LENGTH_SHORT).show()
                R.id.noRadioButton -> Snackbar.make(radioButton, "Oga go and find a girlfriend.", Snackbar.LENGTH_SHORT).show()
                R.id.maybeRadioButton -> Snackbar.make(radioButton, "Oga talk joor, who is she?", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}