package com.example.tugas3_composablelayout2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout.model.Maha

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

private val daftarMahasiswa = listOf(
    Mahasiswa(
        name = R.string.name_bambang,
        address = R.string.address_bambang,
        cardColor = R.color.card_gray,
        nameColor = R.color.text_white,
        phoneColor = R.color.text_cyan,
        addressColor = R.color.text_yellow,
        nameFont = R.font.dancing_script
    ),
    Mahasiswa(
        name = R.string.name_gibran,
        phone = R.string.phone_gibran,
        address = R.string.address_gibran,
        cardColor = R.color.card_purple,
        nameColor = R.color.text_white,
        phoneColor = R.color.text_cyan,
        addressColor = R.color.text_yellow
    ), Mahasiswa(
        name = R.string.name_zhilal,
        phone = R.string.phone_zhilal,
        address = R.string.address_zhilal,
        cardColor = R.color.card_blue,
        nameColor = R.color.text_white,
        phoneColor = R.color.text_cyan,
        addressColor = R.color.text_white
    ),
    Mahasiswa(
        name = R.string.name_alfian,
        phone = R.string.phone_alfian,
        address = R.string.address_alfian,
        cardColor = R.color.card_green,
        nameColor = R.color.text_white,
        phoneColor = R.color.text_cyan,
        addressColor = R.color.text_white
    )
)

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .padding(horizontal = dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Column(
            modifier = Modifier.padding(
                top = dimensionResource(R.dimen.header_top_padding),
                bottom = dimensionResource(R.dimen.header_bottom_padding)
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.header_title),
                color = colorResource(R.color.text_primary),
                fontSize = dimensionResource(R.dimen.text_title).value.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.header_subtitle),
                color = colorResource(R.color.text_primary),
                fontSize = dimensionResource(R.dimen.text_subtitle).value.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            daftarMahasiswa.forEach { mahasiswa ->
                PersonCard(mahasiswa = mahasiswa)
            }
        }
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.footer_copyright),
            color = colorResource(R.color.text_primary),
            fontSize = dimensionResource(R.dimen.text_footer).value.sp,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.footer_padding))
        )

    }
}

@Composable
fun PersonCard(
    mahasiswa: Mahasiswa,
    modifier: Modifier = Modifier
) {
    val isCursive = mahasiswa.nameFont != null
    val nameFontFamily = mahasiswa.nameFont?.let { FontFamily(Font(it)) }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(mahasiswa.cardColor)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.card_padding)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CardLogo()

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(R.dimen.card_padding)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.text_gap))
            ) {
                Text(
                    text = stringResource(mahasiswa.name),
                    color = colorResource(mahasiswa.nameColor),
                    fontSize = dimensionResource(
                        if (isCursive) R.dimen.text_name_cursive else R.dimen.text_name
                    ).value.sp,
                    fontWeight = if (isCursive) FontWeight.Normal else FontWeight.Bold,
                    fontStyle = if (isCursive) FontStyle.Italic else FontStyle.Normal,
                    fontFamily = nameFontFamily
                )
                mahasiswa.phone?.let { phone ->
                    Text(
                        text = stringResource(phone),
                        color = colorResource(mahasiswa.phoneColor),
                        fontSize = dimensionResource(R.dimen.text_detail).value.sp
                    )
                }
                Text(
                    text = stringResource(mahasiswa.address),
                    color = colorResource(mahasiswa.addressColor),
                    fontSize = dimensionResource(R.dimen.text_detail).value.sp
                )
            }
            CardLogo()
        }
    }
}

@Composable
private fun CardLogo() {
    Image(
        painter = painterResource(R.drawable.logo_umy),
        contentDescription = stringResource(R.string.logo_description),
        modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}


