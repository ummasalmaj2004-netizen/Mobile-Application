package com.example.unit1codelabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Connects to layout file activity_main.xml
        setContentView(R.layout.activity_main)
    }
}

