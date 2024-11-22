package com.coderscastle.provabok.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size

import com.coderscastle.provabok.R
import com.coderscastle.provabok.view.HomeRecentJobDesign

@Composable
fun AsyncImageJobItem (imageUrl: String){
    Box (
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        val model = ImageRequest
            .Builder(LocalContext.current)
            .data(imageUrl)
            .size(Size.ORIGINAL)
            .crossfade(1000)
            .build()

        val imageState = rememberAsyncImagePainter(model=model).state

        if (imageState is AsyncImagePainter.State.Success){

            AsyncImage(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
                model = model,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }

        if (imageState is AsyncImagePainter.State.Loading){
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
                painter = painterResource(R.drawable.placeholder_image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }

        if (imageState is AsyncImagePainter.State.Error){

            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
                painter = painterResource(R.drawable.image_not_found),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }

    }
}

