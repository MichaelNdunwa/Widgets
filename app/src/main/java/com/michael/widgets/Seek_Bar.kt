package com.michael.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class Seek_Bar : AppCompatActivity() {

    private lateinit var seekBarDisplay: TextView
    private lateinit var seekBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        seekBarDisplay = findViewById(R.id.seekBarDisplay)
        seekBar = findViewById(R.id.seekBar)

        seekBar.setOnSeekBarChangeListener( object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                seekBarDisplay.text = "Rate ${seekBar?.progress}"
                snackBar("Progressed Changed")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                seekBarDisplay.text = "Rate ${seekBar?.progress}"
                snackBar("Start Tracking Touch")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                seekBarDisplay.text = "Rate ${seekBar?.progress}"
                snackBar("Stop Tracking Touch")
            }
        })


    }

    private fun snackBar(message: String) {
        Snackbar.make(seekBar, message, Snackbar.LENGTH_SHORT).show()
    }
}