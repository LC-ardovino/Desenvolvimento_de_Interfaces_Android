package com.example.cadastro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_cadastrar)
        button.setOnClickListener{
            val signupIntent = Intent(this,Pagina2::class.java)
            startActivity(signupIntent)
        }




    }
}