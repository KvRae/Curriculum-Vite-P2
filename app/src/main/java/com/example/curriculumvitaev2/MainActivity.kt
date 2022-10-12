package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.nextBTN)
        var imageButton = findViewById<ImageButton>(R.id.imageButton)
        var name = findViewById<EditText>(R.id.nameTF).text.toString()
        var email = findViewById<EditText>(R.id.emailTF).text.toString()
        var age = findViewById<EditText>(R.id.ageTF).text.toString()

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("age", age)
            startActivity(intent)
        }
    }
}