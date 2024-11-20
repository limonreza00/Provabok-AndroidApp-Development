package com.coderscastle.provabok.view


import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import com.coderscastle.provabok.R
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.coderscastle.provabok.model.BottomNavItem
import com.coderscastle.provabok.navigation.Screen

@Composable
fun BottomBarComposable (navController: NavHostController){

    val navItems = listOf(
        BottomNavItem(
            title = "Home",
            selectedIcon = R.drawable.home_filled,
            unselectedIcon = R.drawable.home_outline,
            hasNews = false,
            route = Screen.Home.route
        ),
        BottomNavItem(
            title = "Jobs",
            selectedIcon = R.drawable.briefcase_filled,
            unselectedIcon = R.drawable.briefcase_outline,
            hasNews = false,
            route = Screen.Jobs.route
        ),
        BottomNavItem(
            title = "Practice",
            selectedIcon = R.drawable.baseline_library_books_24,
            unselectedIcon = R.drawable.outline_library_books_24,
            hasNews = false,
            route = Screen.Practice.route
        ),

        BottomNavItem(
            title = "Notification",
            selectedIcon = R.drawable.baseline_notifications_24,
            unselectedIcon = R.drawable.outline_notifications_24,
            hasNews = false,
            route = Screen.Notifications.route
        )

    )

    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    NavigationBar {

        navItems.forEach {  item ->
            val isItemSelected = item.route == currentRoute
            NavigationBarItem(

                selected = isItemSelected,
                onClick = {

                    navController.navigate(item.route) {
                        popUpTo(Screen.Home.route) { inclusive = false }
                        launchSingleTop = true
                    }

                },
                label = { Text(text = item.title) },

                icon = {

                    if (isItemSelected) Icon(painter = painterResource(id = item.selectedIcon), contentDescription = item.title)
                    else Icon(painter = painterResource(id = item.unselectedIcon), contentDescription = item.title)


                    if (item.hasNews) {
                        BadgedBox(
                            badge = { Text(text = "1") }
                        ) {

                        }
                    }


                },


                )

        }
    }
}