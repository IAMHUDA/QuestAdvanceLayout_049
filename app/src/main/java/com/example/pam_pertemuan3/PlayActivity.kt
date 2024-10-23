package com.example.pam_pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlayActivty(modifier: Modifier) {
    Column(modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(
            text = "Kepada Yth",
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "Rizki Ramadhan",
            modifier = Modifier.padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isinya = "Miftahul Huda"
        )
        DetailSurat(
            judul = "Alamat",
            isinya = "Kota Yogakarta ,jawa Tengah ,bantul"
        )
        DetailSurat(
            judul = "NoTelpon",
            isinya = "081340311234"
        )
        DetailSurat(
            judul = "keterangan",
            isinya = "DetailSurat(\n" +
                    "            judul = \"Nama\",\n" +
                    "            isinya = \"Miftahul Huda\"\n" +
                    "        )\n" +
                    "        DetailSurat(\n" +
                    "            judul = \"Alamat\",\n" +
                    "            isinya = \"Kota Yogakarta ,jawa Tengah ,bantul\"\n" +
                    "        )\n" +
                    "        DetailSurat(\n" +
                    "            judul = \"NoTelpon\",\n" +
                    "            isinya = \"081340311234\"\n" +
                    "        )"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderSection() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Gray)
        .padding(15.dp)
    ){
        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column {
                Text(
                    text = "CSIRT Daerah istimewa Yogyaarta",
                    color = Color.White
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Fax : 021-212111, Email : csirt@gmail.com",
                    color = Color.White
                )
            }
            Box{
                Image(painter = painterResource(id = R.drawable.csirt),
                    contentDescription = null,
                    modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
fun DetailSurat(judul:String,isinya:String){
    Column (modifier = Modifier.fillMaxWidth().padding(16.dp)
    ){
        Row (modifier = Modifier.fillMaxWidth()
            .padding(top = 20.dp)){
            Text(
                text = judul,
                modifier = Modifier.weight(0.8f)
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = isinya,
                modifier = Modifier.weight(2f)
            )
        }
    }
}
