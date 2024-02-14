package com.acasloa946.finalproject.API.Models

import com.acasloa946.finalproject.API.Models.APIVideogame

data class APIResponse(
    val count: Int,
    val results: List<APIVideogame>
)