package com.example.prak2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}
@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
    }
}
@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color = Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        val gambar = painterResource(id = R.drawable.ic_launcher_foreground)
        Image(
            painter = gambar,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = "My Layout",
            fontSize = 50.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Row1 Komponen1")
                Text(text = "Row1 Komponen2")
                Text(text = "Row1 Komponen3")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Row2 Komponen1")
                Text(text = "Row2 Komponen2")
                Text(text = "Row2 Komponen3")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val gambar = painterResource(id = R.drawable.ic_launcher_foreground)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Text(text = "Col1 Row1 Komponen1")
                Text(text = "Col1 Row1 Komponen2")
                Text(text = "Col1 Row1 Komponen3")
            }
        }
    }
}