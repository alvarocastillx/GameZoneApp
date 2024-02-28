package com.acasloa946.finalproject.API.Models


/**
 * DATA CLASS DEL VIDEOJUEGO QUE RESCATO DE API RAWG.IO
 * @property name: nombre del videojuego
 * @property background_image: imagen del videojuego -> sirve para añadir al videojuego cuando se esta creando para introducirse en base de datos
 * @property metacritic: puntuación del videojuego -> sirve para añadir al videojuego cuando se esta creando para introducirse en base de datos
 */
data class APIVideogame(
    val name: String,
    val background_image:String,
    val metacritic:Int
)