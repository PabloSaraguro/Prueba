package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imccanino.*

class Imccanino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccanino)

        val genero: Spinner = findViewById(R.id.spn_genero)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_genero,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            genero.adapter = adapter
        }

        val raza: Spinner = findViewById(R.id.spn_raza)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_raza,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            raza.adapter = adapter
        }

        val tipo: Spinner = findViewById(R.id.spn_tipo)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_tipo,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            tipo.adapter = adapter
        }


        btn_calcular_imc.setOnClickListener{
            try {

                var peso = et_peso_corporal.text.toString().toDouble()
                var altura = et_altura_hombro.text.toString().toDouble()
                var occipucio = et_base_a_cola.text.toString().toDouble()




                var nombre = et_nombre.text.toString()



                val irA = Intent(this, Resultado::class.java)

                irA.putExtra("peso", peso)
                irA.putExtra("altura", altura)
                irA.putExtra("occipucio", occipucio)

                irA.putExtra("nombre", nombre)

                startActivity(irA)

            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext,"Ingrese valores Validos", Toast.LENGTH_SHORT).show()
            }
        }


    }
}