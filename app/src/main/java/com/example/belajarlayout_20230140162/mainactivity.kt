package com.example.belajarlayout_20230140162

package com.example.belajarlayout_20230140162

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
// Pastikan package theme ini sesuai dengan nama project Anda
import com.example.belajarlayout_20230140162.ui.theme.BelajarLayout_20230140162Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Ganti nama Theme jika nama proyek Anda berbeda
            BelajarLayout_20230140162Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Memanggil Composable Layout Utama
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}