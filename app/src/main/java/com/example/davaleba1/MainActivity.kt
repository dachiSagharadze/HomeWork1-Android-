package com.example.davaleba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val email = findViewById<EditText>(R.id.email)
        val message = findViewById<EditText>(R.id.message)

        button.setOnClickListener {
            val emailText = email.text.toString()
            val messageText = message.text.toString()
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("email", emailText)
            intent.putExtra("message", messageText)


            startActivity(intent)
        }

    }
}