package com.coderscastle.provabok.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
   LazyColumn {
       item{
           Column(
               modifier = Modifier
           ) {

               Box (
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(start = 15.dp, end = 15.dp, top = 16.dp)
                       .height(120.dp)
                       .background(
                           shape = RoundedCornerShape(16.dp),
                           color = Color.LightGray
                       )
               ) {
                   ImageSlider()
               }

               Spacer(modifier = Modifier.height(10.dp))

               Box(
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp)
                       .padding(start = 15.dp, end = 15.dp)
               ) {
                   Column {
                       Row {
                           Text(text = "Recent Exams ")
                           Spacer(modifier = Modifier.weight(1f))
                           Text(
                               text = "See All",
                               modifier = Modifier
                                   .clickable { },
                               color = Color.Blue
                           )
                       }

                       Spacer(modifier = Modifier.height(10.dp))

                       HomeRecentExamDesign()
                   }
               }

               Spacer(modifier = Modifier.height(10.dp))

               Box(
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(700.dp)
                       .padding(start = 15.dp, end = 15.dp)
               ) {
                   Column {
                       Row {
                           Text(text = "Recent Jobs ")
                           Spacer(modifier = Modifier.weight(1f))
                           Text(
                               text = "See All",
                               modifier = Modifier
                                   .clickable { },
                               color = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(10.dp))

                       HomeRecentJobDesign()
                   }
               }


           }
       }
   }
}




