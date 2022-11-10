package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var extras = intent.extras

        var peso = extras?.getInt("peso")?:0
        var altura = extras?.getInt("altura")?:0
        var occipucio = extras?.getInt("occipucio")?:0

        var nombre = extras?.getString("nombre")?:"Sin Nombre"

        var circunpelvica = 1
        var tipo = "imc"
        var raza = "pequenia"



        var resultimc = peso / (altura * occipucio)
        var resultgmachos = (-1.4 * altura) + (0.7 * circunpelvica) + 4
        var resultghembras = (-1.7 * altura) + (0.93 * circunpelvica) + 5


        var resultadocuan = 0.0
        var resultadocual = "Sobre peso"


        when (tipo){
            "IMC canino" -> resultadocuan = resultimc.toDouble()

            "Grasa Corporal Macho" -> resultadocuan = resultgmachos

            "Grasa Corporal Hembra" -> resultadocuan = resultghembras
        }

        when (raza){
            "Mini toy" -> {
                if (peso<1){
                    resultadocual = "Peso bajo"
                }else if(peso>6){
                    resultadocual = "Sobre peso"
                } else{
                    resultadocual = "Peso Normal"
                }
            }

            "Pequenias" -> {
                if (peso<7){
                    resultadocual = "Peso bajo"
                }else if(peso>15){
                    resultadocual = "Sobre peso"
                } else{
                    resultadocual = "Peso Normal"
                }
            }

            "Medianas" -> {
                if (peso<14){
                    resultadocual = "Peso bajo"
                }else if(peso>27){
                    resultadocual = "Sobre peso"
                } else{
                    resultadocual = "Peso Normal"
                }
            }

            "Grandes" -> {
                if (peso<25){
                    resultadocual = "Peso bajo"
                }else if(peso>39){
                    resultadocual = "Sobre peso"
                } else{
                    resultadocual = "Peso Normal"
                }
            }

            "Gigantes" -> {
                if (peso<34){
                    resultadocual = "Peso bajo"
                }else if(peso>82){
                    resultadocual = "Sobre peso"
                } else{
                    resultadocual = "Peso Normal"
                }
            }




        }








        tv_encabezado.setText("El $tipo  de $nombre es:")
        tv_imc_resultado.setText("$resultadocuan")
        tv_cualitativa.setText("$resultadocual")



        btn_regresar.setOnClickListener{
            val irA = Intent(this,MainActivity::class.java)
            startActivity(irA)
        }


        /// val spinner : Spinner = findviewbyid(R.id.spinner)
    // spineronitemselectedLitener = this
        // <string name="app_name">Prueba</string>


    }
}