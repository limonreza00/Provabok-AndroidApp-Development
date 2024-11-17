package com.coderscastle.provabok.navigation

sealed class Screen (val route : String) {

    object Home : Screen("home")
    object Jobs : Screen("jobs")
    object Practice : Screen("practice")
    object Bookmarks : Screen("bookmarks")
    object Notifications : Screen("notifications")
}
