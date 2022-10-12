package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intent=Intent(this,MainActivity::class.java)
        val imageButton = findViewById<TextView>(R.id.imageButton)
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val gendre = intent.getStringExtra("gendre")

        findViewById<TextView>(R.id.nameIPT).text = name
        findViewById<TextView>(R.id.emailIPT).text = email
        findViewById<TextView>(R.id.ageIPT).text = age
        findViewById<TextView>(R.id.ageIPT).text = age



    }
}