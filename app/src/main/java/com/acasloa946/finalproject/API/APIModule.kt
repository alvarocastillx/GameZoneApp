package com.acasloa946.finalproject.API

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.acasloa946.finalproject.API.Models.APIVideogame
import com.acasloa946.finalproject.API.const.Companion.API_KEY
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException

class APIModule {
    suspend fun getAPIVideogame(title: String): APIVideogame {
        val apiService = RetrofitInstance.api

        val listaVideogames: MutableState<List<APIVideogame>> = mutableStateOf(listOf())
        val coroutineScope = CoroutineScope(Dispatchers.Default)


        coroutineScope.launch {
            try {
                val response = apiService.getResultByName(
                    search = title,
                    searchPrecise = true, searchExact = false,pageSize = 5, excludeAdditions=true, apiKey = API_KEY
                )
                listaVideogames.value = response.results

            } catch (e: HttpException) {
                println("Error HTTP: ${e.code()}")
                println("Mensaje de error: ${e.message()}")
            } catch (e: Exception) {
                println("Error desconocido: $e")

            }
        }.join()
        return listaVideogames.value[0]
    }
}


