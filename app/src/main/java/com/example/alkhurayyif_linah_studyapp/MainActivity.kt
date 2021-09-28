package com.example.alkhurayyif_linah_studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Study App"
        val Androidbutton = findViewById<Button>(R.id.Androidbutton)
        Androidbutton.setOnClickListener{
            val intent = Intent(this, AndroidReview()::class.java)
            startActivity(intent);
        }
        val Kotlinbutton = findViewById<Button>(R.id.Kotlinbutton)
        Kotlinbutton.setOnClickListener{
            val intent = Intent(this, KotlinReview()::class.java)
            startActivity(intent);
        }
    }
}