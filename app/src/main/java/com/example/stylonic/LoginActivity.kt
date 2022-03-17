package com.example.stylonic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    var textView: TextView? = null
    var username: EditText? = null
    var password: EditText? = null
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        textView = findViewById(R.id.textView)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        button = findViewById(R.id.button)

    }
}