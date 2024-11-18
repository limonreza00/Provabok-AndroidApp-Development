package com.coderscastle.provabok.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.coderscastle.provabok.navigation.ManageNavigation
import com.coderscastle.provabok.navigation.Screen
import com.coderscastle.provabok.ui.theme.ProvabokTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    ProvabokTheme {
        val navController = rememberNavController()
        val bottomBarScreens = listOf(Screen.Home.route, Screen.Practice.route, Screen.Jobs.route, Screen.Notifications.route)
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
        Scaffold(


            topBar = {TopAppBar(navController = navController)},


            bottomBar = {

                if (currentRoute in bottomBarScreens) {
                    BottomBarComposable(navController = navController)
                }

            }
        ){
            Surface (
                modifier = Modifier.padding(it)
            ) {
                ManageNavigation(navController = navController)
            }
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {

   MainScreen()
}

