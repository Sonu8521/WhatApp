package com.example.washsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Washapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_washapp)
        Handler().postDelayed({
            val x= Intent(this,MainActivity::class.java)
            startActivity(x)
            finish()
        },2000)
    }
}