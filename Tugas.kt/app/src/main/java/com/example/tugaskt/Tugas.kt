package com.example.tugaskt

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasScreen() {
    Box(modifier = Modifier.fillMaxSize()) {

        // Background full screen
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bantul",
                color = Color.Blue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Estimasi Cuaca,",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(id = R.drawable.logo_cuaca),
                contentDescription = "Logo Cuaca",
                modifier = Modifier.size(140.dp)
            )

            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Pascal Pahlevi Pasha",
                color = Color.Blue,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "20000140001",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(id = R.drawable.foto_alam),
                contentDescription = "Foto",
                modifier = Modifier
                    .size(320.dp)
                    .clip(CircleShape)
                    .border(BorderStroke(4.dp, Color.White), CircleShape)
                    .background(Color(0xFFE8E8F5)),
                contentScale = ContentScale.Fit
            )
        }
    }
}