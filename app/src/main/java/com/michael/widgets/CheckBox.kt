package com.michael.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CheckBox : AppCompatActivity() {

    private lateinit var kotlinCheckBox: CheckBox
    private lateinit var javaCheckBox: CheckBox
    private lateinit var pythonCheckBox: CheckBox
    private lateinit var dartCheckBox: CheckBox
    private lateinit var submitButton: Button
    private lateinit var answerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

       /* kotlinCheckBox = findViewById(R.id.kotlinCheckBox)
        javaCheckBox = findViewById(R.id.javaCheckBox)*/
    }
}