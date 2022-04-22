package com.example.myapplicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        val b = findViewById<Button>(R.id.b_push)
        b.setOnClickListener {
            openNext()
        }
    }

    fun openNext(){
        val intent = Intent(this, DataActivity::class.java)
        startActivity(intent)
    }
}