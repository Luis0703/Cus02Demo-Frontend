package com.example.cus02demo.navigation

sealed class AppScreen(val route: String){
    object splahScreen: AppScreen("splash")
    object homeScreen: AppScreen("home")
    object trackingScreen: AppScreen("tracking")
    object solicitudScreen: AppScreen("solicitud")
    object informationScreen: AppScreen("information")
    object areaComunScreen: AppScreen("AreaComunInfo")
    object anulacionScreen: AppScreen("AnulacionInfo")
}
