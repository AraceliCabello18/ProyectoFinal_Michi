package com.example.michi_proyectofinal

import android.os.Bundle
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.michi_proyectofinal.databinding.ActivityActualizarGatosBinding

class ActualizarGatos : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityActualizarGatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar_gatos)

        val id_gatos = intent.getIntExtra( "id_gatos", -1)
        val raza = intent.getIntExtra("raza")
        val descripcion = intent.getIntExtra("descripcion")
        val caracter = intent.getIntExtra("caracter")
        val origen = intent.getIntExtra("origen")
        val tamano = intent.getIntExtra("tamano")
        val peso = intent.getIntExtra("peso")
        val esperanzaVida = intent.getIntExtra("esperanzaVida")


        val editarTextRaza = findViewById<EditText>(R.id.raza)
        val editarTextDescripcion = findViewById<EditText>(R.id.descripcion)
        val editarTextApCaracter = findViewById<EditText>(R.id.caracter)
        val editarTextOrigen = findViewById<EditText>(R.id.origen)
        val editarTextTamano = findViewById<EditText>(R.id.tamano)
        val editarTextPeso = findViewById<EditText>(R.id.peso)
        val editarTextEsperanzaVida = findViewById<EditText>(R.id.esperanzaVida)


    }

}