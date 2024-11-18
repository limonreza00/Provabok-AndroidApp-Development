package com.coderscastle.provabok.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.coderscastle.provabok.view.HomeScreen
import com.coderscastle.provabok.view.JobsScreen
import com.coderscastle.provabok.view.NotificationScreen
import com.coderscastle.provabok.view.PracticeScreen

@Composable
fun ManageNavigation(navController : NavHostController){

        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
        ){

                composable(Screen.Home.route){

                    HomeScreen(navController = navController)

                }



                composable(Screen.Jobs.route){
                    JobsScreen(navController = navController)
                }


                composable(Screen.Practice.route){

                    PracticeScreen(navController = navController)
                }


                composable(Screen.Bookmarks.route){

                }


                composable(Screen.Notifications.route){
                    NotificationScreen(navController = navController)

                }


    }
}