package com.example.cus02demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cus02demo.ui.view.AnimatedSplashScreen
import com.example.cus02demo.ui.view.HomeScreen
//import com.example.cus02demo.ui.view.InformationScreen
/*import com.example.cus02demo.ui.view.SolicitudScreen*/
import com.example.cus02demo.ui.view.RegistrationScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.homeScreen.route){
        /*composable(route = AppScreen.splahScreen.route) {
            AnimatedSplashScreen(navController)
        }*/
        composable(route = AppScreen.homeScreen.route){
            HomeScreen(navController)
        }
        composable(route = AppScreen.RegistrationScreen.route ){
            RegistrationScreen(navController)
        }
        /*composable(route = AppScreen.solicitudScreen.route+"/{body}" ){
            val body = it.arguments?.getString("body") ?: "0"
            SolicitudScreen(navController,body)
        }*/

        /*composable(route = AppScreen.informationScreen.route +"/{body}/{body1}"){
            val body = it.arguments?.getString("body") ?: "0"
            val body1 = it.arguments?.getString("body1") ?: "0"
            InformationScreen(navController,body,body1)
        }*/
    }
}