package com.example.actbasiccomposable_0195

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakDenganGambarBaru(modifier: Modifier = Modifier) {
    // Gunakan Column agar gambar dan teks bisa tersusun ke bawah secara berurutan
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        val customGambar = painterResource(id = R.drawable.bunga)

        // 1. Menampilkan Gambar
        Image(
            painter = customGambar,
            contentDescription = "Gambar Bunga Aster",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 2. Menampilkan Teks Deskripsi secara Visual di Layar
        Text(
            text = "Ini merupakan Bunga aster (daisy) salah satu tanaman hias dari famili Asteraceae yang dikenal dengan tampilan mahkota bunganya yang melingkar rapi mengelilingi bagian tengah berbentuk cakram. " +
                    "Secara umum, spesies paling populer seperti English daisy (Bellis perennis) atau Oxeye daisy (Leucanthemum vulgare) memiliki mahkota berwarna putih bersih dengan bagian pusat berwarna kuning terang. " +
                    "Bunga ini melambangkan kemurnian dan kepolosan, serta memiliki ciri khas menguncup di malam hari dan kembali mekar saat menyambut cahaya matahari di pagi hari.",
            fontSize = 14.sp
        )
    }
}