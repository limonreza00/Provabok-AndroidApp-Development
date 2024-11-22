package com.coderscastle.provabok.view

import com.coderscastle.provabok.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun ImageSlider(
) {
    Image(
        painter = painterResource(R.drawable.briefcase_filled),
        contentDescription = "Image 1",
        contentScale = ContentScale.Fit,
        modifier = Modifier.fillMaxSize()
    )
}

