package com.michael.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ToggleButton
import com.google.android.material.snackbar.Snackbar

class ToggleButtonActivity : AppCompatActivity() {

    private lateinit var bulbLight: ImageView
    private lateinit var bulbSwitch: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        bulbLight = findViewById(R.id.bulb_light)
        bulbSwitch = findViewById(R.id.bulb_switch)

        bulbSwitch.setOnCheckedChangeListener { buttonView, on ->
            if (on) {
                bulbLight.setImageResource(R.drawable.turned_on_bulb)
                Snackbar.make(buttonView, "Light turned on", Snackbar.LENGTH_SHORT).show()
            } else {
                bulbLight.setImageResource(R.drawable.turned_off_bulb)
                Snackbar.make(buttonView, "Light turned off", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}