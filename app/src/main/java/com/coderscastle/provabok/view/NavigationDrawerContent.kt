package com.coderscastle.provabok.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import com.coderscastle.provabok.navigation.Screen
import com.coderscastle.provabok.R


@Composable
fun NavigationDrawerLayout(
    selectedRoute: String,
    onItemClick: (String) -> Unit,
    onCloseDrawer: () -> Unit
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        NavigationDrawerItemDesign(
            title = "Home",
            selectedIcon = R.drawable.home_filled,
            unselectedIcon = R.drawable.home_outline,
            selected = selectedRoute == Screen.Home.route,
            onItemClick = {
                onItemClick(Screen.Home.route)
                onCloseDrawer()
            },
            badgeCount = 10

        )

        NavigationDrawerItemDesign(
            title = "Jobs",
            selectedIcon = R.drawable.briefcase_filled,
            unselectedIcon = R.drawable.briefcase_outline,
            selected = selectedRoute == Screen.Jobs.route,
            onItemClick = {
                onItemClick(Screen.Jobs.route)
                onCloseDrawer()
            }
        )

        NavigationDrawerItemDesign(
            title = "Practice",
            selectedIcon = R.drawable.book_filled,
            unselectedIcon = R.drawable.book_outline,
            selected = selectedRoute == Screen.Practice.route,
            onItemClick = {
                onItemClick(Screen.Practice.route)
                onCloseDrawer()
            }
        )

        Spacer(modifier = Modifier.weight(1f))

        NavigationDrawerItemDesign(
            title = "Profile",
            selectedIcon = R.drawable.person_filled,
            unselectedIcon = R.drawable.person_outline,
            selected = selectedRoute == Screen.Profile.route,
            onItemClick = {
                onItemClick(Screen.Profile.route)
                onCloseDrawer()
            }
        )

    }
}



@Composable
fun NavigationDrawerItemDesign (
   title : String,
   selectedIcon : Int,
   unselectedIcon : Int,
   badgeCount : Int? = null,
   selected : Boolean,
   onItemClick : () -> Unit
){

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onItemClick)
            .background(
                color = if (selected) Color.LightGray else Color.Transparent,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
       if (selected)Icon(painter = painterResource(id = selectedIcon), contentDescription = title) else
           Icon(painter = painterResource(id = unselectedIcon), contentDescription = title)
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = title, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.weight(1f))
        if (badgeCount != null)
        Text(text = badgeCount.toString(), style = MaterialTheme.typography.bodyMedium)

    }

}