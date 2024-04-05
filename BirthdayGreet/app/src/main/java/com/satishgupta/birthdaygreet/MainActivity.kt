package com.satishgupta.birthdaygreet

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).text.toString();
        Toast.makeText(this, "Button was clicked. Name: $name", Toast.LENGTH_LONG).show()
    }
}