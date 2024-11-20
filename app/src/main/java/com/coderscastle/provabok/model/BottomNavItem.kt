package com.coderscastle.provabok.model

data class BottomNavItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon : Int ,
    val route: String,
    val hasNews : Boolean
)
