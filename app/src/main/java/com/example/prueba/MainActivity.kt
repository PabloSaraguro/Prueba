package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_imccanino.setOnClickListener {
            val irA = Intent(this,Imccanino::class.java)
            startActivity(irA)
        }

        btn_grasa_macho.setOnClickListener {
            val irA = Intent(this,Imccanino::class.java)
            startActivity(irA)
        }

        btn_grasa_hembra.setOnClickListener {
            val irA = Intent(this,Imccanino::class.java)
            startActivity(irA)
        }

    }
}