package com.example.serene

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val btnSave = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.save_button)
        val etSubject = findViewById<EditText>(R.id.etSubject)
        val etDate = findViewById<EditText>(R.id.etDate)
        val etTime = findViewById<EditText>(R.id.etTime)
        val etDuration = findViewById<EditText>(R.id.etDuration)

        btnSave.setOnClickListener {
            val subject = etSubject.text.toString().trim()
            val date = etDate.text.toString().trim()
            val time = etTime.text.toString().trim()
            val duration = etDuration.text.toString().trim()

            var isValid = true

            if (subject.isEmpty()) {
                etSubject.error = getString(R.string.error_subject)
                isValid = false
            }

            if (date.isEmpty()) {
                etDate.error = getString(R.string.error_date)
                isValid = false
            }

            if (time.isEmpty()) {
                etTime.error = getString(R.string.error_time)
                isValid = false
            }

            if (duration.isEmpty()) {
                etDuration.error = getString(R.string.error_duration)
                isValid = false
            }

            if (isValid) {
                Toast.makeText(this, getString(R.string.msg_saved), Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}