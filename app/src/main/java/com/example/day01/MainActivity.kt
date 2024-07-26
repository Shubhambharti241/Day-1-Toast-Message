package com.example.day01

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDownload = findViewById<Button>(R.id.BtnDownload)
        val buttonUpload = findViewById<Button>(R.id.BtnUpload)

        buttonDownload.setOnClickListener {
            Toast.makeText(this ,"Downloading..",Toast.LENGTH_SHORT).show()
        }
        
        buttonUpload.setOnClickListener {
            Toast.makeText(this , "Uploading..",Toast.LENGTH_SHORT).show()
        }


    }
}