package com.example.davaleba1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val intent = intent

        val email = intent.getStringExtra("email")
        val message = intent.getStringExtra("message")

        val emailText = findViewById<TextView>(R.id.emailText)
        val messageText = findViewById<TextView>(R.id.messageText)
        val clearBtn = findViewById<Button>(R.id.clearBtn)

        emailText.text = email
        messageText.text = message

        clearBtn.setOnClickListener {
            emailText.text = ""
            messageText.text = ""
        }

        }
    }