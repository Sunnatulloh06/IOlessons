package com.example.draftsfortasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Gallery(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
            .padding(top = 50.dp, bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Animals", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

        CommonDescription(
            imageResId = R.drawable.tiger,
            "Tiger",
            "Age: 20",
            "Tigers are very dangerous Animals. Usually the live in the Forests"
        )
        Spacer(modifier = Modifier.height(35.dp))

        CommonDescription(
            imageResId = R.drawable.elephant,
            "Elephant",
            "Age: 10",
            "Elephants are the largest living land animals. Three living species are currently recognised: the African bush elephant (Loxodonta africana), the African"
        )
        Spacer(modifier = Modifier.height(35.dp))

        CommonDescription(
            imageResId = R.drawable.lion,
            "Lion",
            "Age: 5",
            "The lion (Panthera leo) is a large cat of the genus Panthera, native to Africa and India."
        )

        Spacer(modifier = Modifier.height(35.dp))

        CommonDescription(
            imageResId = R.drawable.lion,
            "Lion",
            "Age: 5",
            "The lion (Panthera leo) is a large cat of the genus Panthera, native to Africa and India."
        )


        Spacer(modifier = Modifier.height(35.dp))

        CommonDescription(
            imageResId = R.drawable.lion,
            "Lion",
            "Age: 5",
            "The lion (Panthera leo) is a large cat of the genus Panthera, native to Africa and India."
        )
    }
}