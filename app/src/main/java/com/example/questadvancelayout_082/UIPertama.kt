package com.example.questadvancelayout_082

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasPertama(modifier: Modifier) {
    //column 1
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }
        //column 2
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Blue
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val gambar = painterResource(R.drawable.logo_umy)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier.size(100.dp).padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column() {
                        Text(
                            stringResource(R.string.nama),
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.White,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Text(
                            stringResource(R.string.nohp),
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color(0xFF4FC3F7),
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            stringResource(R.string.alamat),
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                        )

                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    stringResource(R.string.copy),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 50.dp)
                )
            }
        }
    }
}