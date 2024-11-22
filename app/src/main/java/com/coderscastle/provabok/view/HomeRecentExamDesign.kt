package com.coderscastle.provabok.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeRecentExamDesign(){
    LazyRow(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(8.dp) // Space between items
    ) {
        items(10) { index -> // Display 10 items
            Card(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(150.dp),

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ){
                    Text("Exam Name")
                    Text("category")
                    Text("Date")


                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeRecentJobDesignPreview(){
    HomeRecentExamDesign()

}
