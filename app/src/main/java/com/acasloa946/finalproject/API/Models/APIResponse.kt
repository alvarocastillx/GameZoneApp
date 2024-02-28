package com.acasloa946.finalproject.API.Models


/**
 * Data class de respuesta de API RAWG.IO
 */
data class APIResponse(
    val count: Int,
    val results: List<APIVideogame>
)