package com.coderscastle.provabok.view

data class BottomNavItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon : Int ,
    val route: String,
    val hasNews : Boolean
)
