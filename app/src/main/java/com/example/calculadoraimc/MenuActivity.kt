package com.example.calculadoraimc

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnCalculadoraApp = findViewById<Button>(R.id.btn1)
        val btnImcApp = findViewById<Button>(R.id.btn2)

        btnCalculadoraApp.setOnClickListener { navigateToCalculadoraApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToImcApp(){

    }
    private fun navigateToCalculadoraApp() {
        TODO("Not yet implemented")
    }
}