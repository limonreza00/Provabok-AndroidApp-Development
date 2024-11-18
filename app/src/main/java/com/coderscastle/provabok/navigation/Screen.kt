package com.coderscastle.provabok.navigation

sealed class Screen (val route : String) {

    object Home : Screen("home")
    object Jobs : Screen("jobs")
    object Practice : Screen("practice")
    object Notifications : Screen("notifications")

    object Bookmarks : Screen("bookmarks")

    object Profile : Screen("profile")
}
