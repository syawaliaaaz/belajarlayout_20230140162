import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Menggunakan Composable yang disorot di baris 35-51
@Composable
fun TatakLetakColumn2(modifier: Modifier = Modifier) {
    // Column menumpuk elemen secara vertikal
    Column(
        modifier = modifier
            .padding(top = 50.dp, bottom = 50.dp, start = 20.dp, end = 20.dp)
            .clickable(onClick = {}) // Membuat composable dapat di-klik
            .fillMaxSize(), // Mengisi seluruh ruang yang tersedia
        verticalArrangement = Arrangement.Bottom, // Menempatkan elemen anak di bagian bawah
        horizontalAlignment = Alignment.End // Menyelaraskan elemen anak secara horizontal ke kanan
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// Menggunakan Composable yang disorot di baris 55-57
@Composable
fun TatakLetakRow(modifier: Modifier = Modifier) {
    // Row menempatkan elemen secara horizontal
    Row(
        modifier = modifier.fillMaxWidth(), // Mengisi lebar maksimum
        horizontalArrangement = Arrangement.SpaceBetween, // Memberi ruang yang sama di antara elemen
        verticalAlignment = Alignment.CenterVertically // Menyelaraskan elemen anak secara vertikal di tengah
    ) {
        // Contoh komponen di dalam Row
        Text(text = "Elemen A")
        Text(text = "Elemen B")
        Text(text = "Elemen C")
    }
}

// Tambahkan fungsi Preview untuk melihat hasilnya
@Preview(showBackground = true)
@Composable
fun PreviewTatakLetak() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Menampilkan Column
        TatakLetakColumn2(modifier = Modifier.weight(1f).fillMaxHeight())

        // Menampilkan Row di bagian bawah
        TatakLetakRow(modifier = Modifier.padding(16.dp))
    }
}