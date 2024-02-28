package com.acasloa946.finalproject.API

import com.acasloa946.finalproject.API.const.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Instancia de retrofit. Inicializa retrofit y devuelve un APIService.
 */
object RetrofitInstance {

    val api: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }
}