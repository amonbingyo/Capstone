package com.example.phinmap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var login: Button
    private lateinit var registration: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.button_login)
        registration = findViewById(R.id.button_registration)

        login.setOnClickListener{
            val intent = Intent(this,LoginFragment::class.java)
            startActivity(intent)
        }

        registration.setOnClickListener {
            val intent = Intent(this, RegistrationFragment::class.java)
            startActivity(intent)
        }
    }
}