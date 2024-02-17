package com.acasloa946.finalproject.database


//TODO: MAP DE PLATAFORMAS
class Videogame(
    var title: String? = null,
    var publisher: String? = null,
    var year:Int? = null,
    var indie:Boolean? = false,
    var price:String?= null,
    var platforms : MutableMap<String,Boolean>? = null,
    var photo:String? = null,
                ) {



}
