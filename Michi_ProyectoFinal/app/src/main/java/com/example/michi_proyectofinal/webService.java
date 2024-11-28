package com.example.michi_proyectofinal;

import com.google.gson.GsonBuilder
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

object AppConstantes{
        const val BASE_URL="http://10.0.2.2:3000" //Direccion ip de tu equipo de computa si lo emulas desde celular
//Si desde el emulador de android es con la direccion ip establecida
}

interface webService {
    @POST("/appAgregarUsuario")
    suspend fun agregarUsuarios(
            @Body usuarios: Usuarios
    ): Response<String>

    @POST("/appInicioSesion")
    suspend fun login(
            @Body loginRequest: LoginRequest
    ): Response<LoginResponse>

    @POST("/appAgregarGatos")
    suspend fun agregarGatos(
            @Body usuarios: gatos
    ): Response<String>
}

object RetrofitClient{
val webService :
WebService by

lazy {
    Retrofit.Builder()
            .baseUrl(AppConstantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService:: class.java)
}
}

