package com.coderscastle.provabok.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.coderscastle.provabok.navigation.ManageNavigation
import com.coderscastle.provabok.navigation.Screen
import com.coderscastle.provabok.ui.theme.ProvabokTheme
import kotlinx.coroutines.launch

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

        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        val navController = rememberNavController()
        val bottomBarScreens = listOf(Screen.Home.route, Screen.Practice.route, Screen.Jobs.route, Screen.Notifications.route)
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                Box (
                    modifier = Modifier
                        .width(300.dp)
                        .fillMaxHeight()
                        .background(Color.White)
                        .padding(top = 50.dp)
                ){
                    NavigationDrawerLayout(
                        selectedRoute = currentRoute ?: Screen.Home.route,
                        onItemClick = { route ->
                            navController.navigate(route) {
                                popUpTo(Screen.Home.route) { inclusive = false }
                                launchSingleTop = true}},
                        onCloseDrawer = { scope.launch { drawerState.close() }}
                    )
                }
            }
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(navController = navController , onMenuClick = {scope.launch{ drawerState.open()}})
                },

                bottomBar = {

                    if (currentRoute in bottomBarScreens) {
                        BottomBarComposable(navController = navController)
                    }

                },

                ){ paddingValue ->
                Box (modifier = Modifier.padding(paddingValue)){
                    ManageNavigation(navController = navController)
                }


            }
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {

   MainScreen()
}

