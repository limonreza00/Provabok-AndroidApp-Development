package com.coderscastle.provabok.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.coderscastle.provabok.R

@Composable
fun JobsScreen (navController: NavHostController){

    LazyColumn (modifier = Modifier){
        
        item{
            Box (
                modifier = Modifier

            ) {

                JobItemDesign()
            }
        }
    }

}


@Composable
fun JobItemDesign(){
   Box (
       modifier = Modifier
           .fillMaxSize(),
       contentAlignment = Alignment.Center
   ) {

       Card (
           modifier = Modifier
               .fillMaxWidth()
               .height(300.dp)
               .padding(10.dp)

       ) {
           Column (modifier = Modifier
               .fillMaxSize()
               .padding(10.dp)
           ){

               Row {
                   Image(
                       modifier = Modifier
                           .clip(CircleShape)
                           .size(50.dp)
                           .background(color = Color.White),
                       painter = painterResource(R.drawable.briefcase_filled),
                       contentDescription = "Company Logo",
                   )
                   Column {
                       Text(
                           text = "Software Engineer",
                           fontSize = TextUnit.Unspecified,
                           fontWeight = FontWeight.Bold,
                       )

                       Text(
                           text = "Software Engineer"

                       )
                   }
               }

               Column {


               }

           }

       }
   }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JobsScreenPreview() {
   JobItemDesign()
}
