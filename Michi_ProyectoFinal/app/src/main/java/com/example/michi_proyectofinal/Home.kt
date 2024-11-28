package com.example.michi_proyectofinal

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.michi_proyectofinal.databinding.ActivityHomeBinding
import kotlinx.coroutines.Dispatchers

class Home : AppCompatActivity() {

    private lateinit var cierraSesion: Button
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityHomeBinding
    private lateinit var adaptador: UsuarioAdapter
    private lateinit var listaUsuarios: arrayListOf<Gatos>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = activityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.itemRvGatos.layoutManager = linearLayouManager(this)

        adaptador = UsuarioAdapter(listaGatos,
            onBorrarClick = {},
            onEditarClik = {}
        )

        binding.itemRvGatos.adapter = adaptador

        obtenerGatos()

        binding.cierraSesion.setOnClickListener {
            cierraSesion()
        }
    }

    private fun obtenerGatos(){
        CoroutineScope(Dispatchers.IO).launch {
            val call = RetrofitClient.webService.obtenerDatos()
            runOnUiThread{
                if (call.isSuccessful && call.body()!=null){
                    listaGatos.clear()
                    listaGatos.addAll(call.body()!!)
                    adaptador.notifyDataSetChanged()
                }else{
                    Toast.makeText(this@Home_activity,"no hay registros", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun cierraSesion(){
        sharedPreferences = getSharedPreferences("user_session", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()

        val intent = intent(this, MainActivity::class.java)
        intent.flags = intent.FLAG_ACTIVITY_NEW_TASK or intent.FLAG_ACTIVITY_CLEAR_TASK


    }
}