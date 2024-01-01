package com.michael.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class CheckBoxActivity : AppCompatActivity() {

    private lateinit var kotlinCheckBox: CheckBox
    private lateinit var javaCheckBox: CheckBox
    private lateinit var pythonCheckBox: CheckBox
    private lateinit var dartCheckBox: CheckBox
    private lateinit var submitButton: Button
    private lateinit var answerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        kotlinCheckBox = findViewById(R.id.kotlinCheckBox)
        javaCheckBox = findViewById(R.id.javaCheckBox)
        pythonCheckBox = findViewById(R.id.pythonCheckBox)
        dartCheckBox = findViewById(R.id.dartCheckBox)
        submitButton = findViewById(R.id.submitButton)
        answerTextView = findViewById(R.id.answerTextView)

        submitButton.setOnClickListener {
            val stringBuilder = StringBuilder()
            /*stringBuilder.append(kotlinCheckBox.text.toString() + "status is: " + kotlinCheckBox.isChecked + "\n")
            stringBuilder.append(javaCheckBox.text.toString() + "status is: " + javaCheckBox.isChecked + "\n")
            stringBuilder.append(pythonCheckBox.text.toString() + "status is: " + pythonCheckBox.isChecked + "\n")
            stringBuilder.append(dartCheckBox.text.toString() + "status is: " + dartCheckBox.isChecked + "\n")*/

            if (kotlinCheckBox.isChecked) {
                stringBuilder.append(kotlinCheckBox.text.toString() + "\n")
            } else {
                stringBuilder.append("")
            }
            if (javaCheckBox.isChecked) {
                stringBuilder.append(javaCheckBox.text.toString() + "\n")
            } else {
                stringBuilder.append("")
            }
            if (pythonCheckBox.isChecked) {
                stringBuilder.append(pythonCheckBox.text.toString() + "\n")
            } else {
                stringBuilder.append("")
            }
            if (dartCheckBox.isChecked) {
                stringBuilder.append(dartCheckBox.text.toString() + "\n")
            } else {
                stringBuilder.append("")
            }

            answerTextView.text = stringBuilder
        }
    }
}