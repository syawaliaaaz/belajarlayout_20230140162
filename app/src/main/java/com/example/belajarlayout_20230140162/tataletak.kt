package com.example.belajarlayout_20230140162

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// --- Fungsi 1: Column Sederhana ---
@Composable
fun TataletakColum(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// --- Fungsi 2: Row Sederhana ---
@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// --- Fungsi 3: Box Sederhana ---
@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Text 2")
        Text(text = "Text 212")
    }
}

// --- Fungsi 4: Row di dalam Column ---
@Composable
fun TataletakColumRow(modifier: Modifier) {
    Column {
        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1 Baris1")
            Text(text = "Komponen2 Baris1")
            Text(text = "Komponen3 Baris1")
        }
        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1 Baris2")
            Text(text = "Komponen2 Baris2")
            Text(text = "Komponen3 Baris2")
        }
    }
}

// --- Fungsi 5: Column di dalam Row (Ini Missing di kode Anda sebelumnya) ---
@Composable
fun TataletakRowColum(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
        }
        Column {
            Text(text = "Komponen3Kolom2")
            Text(text = "Komponen4Kolom2")
        }
    }
}

// --- Fungsi 6: Layout Kompleks (Ini juga Missing dan sering jadi sumber error) ---
@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    // ERROR UTAMA: R.drawable.notasinaton
    // Jika Anda mengalami error di sini, pastikan file gambar ada di folder res/drawable
    val gambar = painterResource(id = R.drawable.notasinaton)

    Column {
        Box(
            modifier = modifier
                .height(110.dp)
                .background(color = Color.Yellow)
                .fillMaxWidth(), // Tambahkan fillMaxWidth agar Box memenuhi lebar
            contentAlignment = Alignment.Center
        ) {
            Column {
                // Row 1
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1 Row1 Komponen1")
                    Text(text = "Col1 Row1 Komponen2")
                    Text(text = "Col1 Row1 Komponen3")
                }
                // Row 2
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1 Row2 Komponen1")
                    Text(text = "Col1 Row2 Komponen2")
                    Text(text = "Col1 Row2 Komponen3")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Design",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}


// --- Fungsi Preview untuk melihat hasil (Ini juga sering menyebabkan error jika hilang) ---
@Preview(showBackground = true)
@Composable
fun TataletakPreview() {
    Column {
        TataletakColum(modifier = Modifier.padding(10.dp))
        TataletakRow(modifier = Modifier.padding(10.dp))
        TataletakBox(modifier = Modifier.height(100.dp).fillMaxWidth())
        TataletakColumRow(modifier = Modifier.padding(10.dp))
        TataletakRowColum(modifier = Modifier.padding(10.dp))
        // TataletakBoxColumnRow tidak disertakan dalam preview ini karena membutuhkan resource R.drawable
    }
}