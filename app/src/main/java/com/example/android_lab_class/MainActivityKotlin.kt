package com.example.android_lab_class

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Kotlin implementation of Lab 1 Demo for comparison with Java
 */
class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab_demo)

        val ftxt = findViewById<TextView>(R.id.fname)
        val nameEdit1 = findViewById<EditText>(R.id.name_edit1)
        val bt1 = findViewById<Button>(R.id.savebt)
        val clearBt = findViewById<Button>(R.id.clearbt)

        bt1.setOnClickListener {
            val name = nameEdit1.text.toString().trim()
            if (name.isEmpty()) {
                val errorMsg = getString(R.string.empty_name_error)
                Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show()
                ftxt.text = errorMsg
                ftxt.setTextColor(0xFFDC2626.toInt())
                nameEdit1.error = errorMsg
                nameEdit1.requestFocus()
            } else {
                val greeting = "Hello, $name!"
                Toast.makeText(this, greeting, Toast.LENGTH_LONG).show()
                ftxt.text = greeting
                ftxt.setTextColor(0xFF1E3A8A.toInt())
                nameEdit1.error = null
            }
        }

        clearBt.setOnClickListener {
            nameEdit1.text.clear()
            ftxt.text = ""
            nameEdit1.error = null
            nameEdit1.requestFocus()
            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()
        }
    }
}
