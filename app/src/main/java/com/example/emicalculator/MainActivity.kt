package com.example.emicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<View>(R.id.emiCalculator).setOnClickListener {
            val intent = Intent(this@MainActivity, EmiCalculateActivity::class.java)
            startActivity(intent)
        }






    }
}