package com.example.actbasiccomposable_0195

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun TataletakDenganGambarBaru(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(color = Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        val customGambar = painterResource(id = R.drawable.bunga)

        Image(
            painter = customGambar,
            contentDescription = "Gambar Bunga",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
    }
}