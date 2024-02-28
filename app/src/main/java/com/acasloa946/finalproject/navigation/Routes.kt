package com.acasloa946.finalproject.navigation


/**
 * Clase routes
 */
sealed class Routes(var route:String) {
    object AdminScreen : Routes("AdminScreen")
    object SettingsScreeen : Routes("SettingsScreen")
    object LoginScreen : Routes("LoginScreen")
    object HomeScreen : Routes("HomeScreen")
    object RegisterScreen : Routes("RegisterScreen")
    object CatalogScreen : Routes("CatalogScreen")




}
