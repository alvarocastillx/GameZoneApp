package com.acasloa946.finalproject.database


/**
 * Data class de Usuario.
 * @property username: nombre de usuario introducido en la página de registro
 * @property email: correo electronico introducido en la página de registro.
 */
data class User (
    var username:String? = null,
    var email:String? = null,
)
