package com.acasloa946.finalproject.navigation

sealed class Routes(var route:String) {
    object AdminScreen : Routes("AdminScreen")
    object SettingsScreeen : Routes("SettingsScreen")
    object LoginScreen : Routes("LoginScreen")
    object HomeScreen : Routes("HomeScreen")
    object RegisterScreen : Routes("RegisterScreen")



}
