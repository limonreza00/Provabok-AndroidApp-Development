package com.coderscastle.provabok.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.coderscastle.provabok.utils.AsyncImageJobItem

@Composable
fun HomeRecentJobDesign() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp) // Space between items
    ) {
        items(10) { index -> // Display 10 items
            Card(
                modifier = Modifier

                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(3.dp),
                shape = RoundedCornerShape(8.dp),
            ) {
                Row(
                    modifier = Modifier
                        .background(color = Color(0x999DAE11))
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(50.dp)
                    ) { AsyncImageJobItem(imageUrl = "https://avatars.githubusercontent.com/u/14994036?v=4") }

                    Column (
                        modifier = Modifier
                            .padding(10.dp)
                    ){
                        Text(text = "বাংলাদেশ চলচ্চিত্র ও টেলিভিশন ইনস্টিটিউট নিয়োগ",
                            maxLines = 1)
                        Text(text = "পদ সংখ্যা : ২৬ টি")
                        Text(text = "শেষ সময় : ১৫ নভেম্বর ২০২৪ তারিখ।")
                    }

                }
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
   HomeRecentJobDesign()
}