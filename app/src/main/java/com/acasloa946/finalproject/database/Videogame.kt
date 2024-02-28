package com.acasloa946.finalproject.database



/**
 * Data class de Videojuego. Las variables title, publisher, year, indice, price, y platforms se introducen mediante el panel de administrador. Las variables metacritic y photo se
 * rescatan de la API rawg.io
 * @property title: titulo del videojuego
 * @property publisher: publisher del videojuego
 * @property year: año del videojuego
 * @property indie: indica si el videojuego es indie o no
 * @property price: precio del videojuego
 * @property platforms: map de las plataformas en las que se puede jugar el videojuego.
 * @property metacritic: puntuación del videojuego. Extraida de API
 * @property photo: foto del videojuego. Extraida de API
 */
class Videogame(
    var title: String? = null,
    var publisher: String? = null,
    var year:Int? = null,
    var indie:Boolean? = false,
    var price:String?= null,
    var platforms : MutableMap<String,Boolean>? = null,
    var metacritic : Int? = null,
    var photo:String? = null,
                ) {



}
