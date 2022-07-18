package com.example.donation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Home_Screen : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        handler = Handler()
        handler.postDelayed({
            val intent= Intent(this ,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}