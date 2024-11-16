package com.coderscastle.provabok.view

import android.graphics.drawable.Icon

data class BottomNavItem(
    val title: String,
    val selectedIcon: Icon,
    val unselectedIcon : Icon ,
    val route: String,
    val hasNews : Boolean
)
