package com.example.belajarlayout_20230140162

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
import androidx.compose.foundation.layout.fillMaxHeight
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
    Column(modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "Box 1")
            Text(text = "Kolom 1")
            Text(text = "Kolom 2")
            Text(text = "Box 2")
            Text(text = "Column 3")
        }
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1")
            Text(text = "Komponen2")
            Text(text = "Komponen3")
            Text(text = "Komponen4")
        }
    }
}
@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column {
        //Baris1
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }

        //Baris2
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataketakRowColumn(modifier: Modifier) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //Kolom1
        Column() {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        //Kolom2
        Column() {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataketakRowColumn2(modifier: Modifier) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //Kolom2
        Column() {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}
@Composable
fun TataketakBoxColumnRow(modifier: Modifier) {
    val painter = painterResource(id = R.drawable.notes_below)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Text(text = "Col1_Row1_Komponen1")
                Text(text = "Col1_Row1_Komponen1")
                Text(text = "Col1_Row1_Komponen1")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Col1_Row1_Komponen1")
            Text(text = "Col1_Row1_Komponen1")
            Text(text = "Col1_Row1_Komponen1")
        }
    }
}
fun TataletakBoxColumnRow(modifier: Modifier) {
    Column {
        Column() {
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                Text(text = "Col1_Row1_Komponen1")
                Text(text = "Col1_Row1_Komponen2")
                Text(text = "Col1_Row1_Komponen3")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Col1_Row2_Komponen1")
            Text(text = "Col1_Row2_Komponen2")
            Text(text = "Col1_Row2_Komponen3")
        }

        Spacer(modifier = Modifier.height(height = 10.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "Musik",
                fontSize = 50.sp,
                color = Color.Red,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(
                    alignment = Alignment.Center
                )
            )
        }
    }
}