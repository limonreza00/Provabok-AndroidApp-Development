package com.coderscastle.provabok.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.coderscastle.provabok.view.BottomBarComposable


@Composable
fun ManageNavigation(){
    val navController = rememberNavController()

    val bottomBarScreens = listOf(Screen.Home.route, Screen.Practice.route, Screen.Jobs.route, Screen.Notifications.route)
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route


    Scaffold(
        bottomBar = {

            if (currentRoute in bottomBarScreens) {
                BottomBarComposable(navController = navController)
            }

        }
    ) { paddingValues ->

        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(paddingValues)
        ){

                composable(Screen.Home.route){

                }



                composable(Screen.Jobs.route){

                }


                composable(Screen.Practice.route){

                }


                composable(Screen.Bookmarks.route){

                }


                composable(Screen.Notifications.route){

                }


        }
    }
}