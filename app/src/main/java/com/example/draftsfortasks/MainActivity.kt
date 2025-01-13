package com.example.draftsfortasks

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.draftsfortasks.ui.theme.DraftsForTasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            TitlePart()
//            SecondTask()
//            Gallery()
            TextFieldExample()
        }
    }
}

//data class CardItem(val name: String, val icon: androidx.compose.ui.graphics.vector.ImageVector)
//
//@Composable
//fun TitlePart() {
//    val cardItems = listOf(
//        CardItem("Shopping", Icons.Default.ShoppingCart),
//        CardItem("Location", Icons.Default.LocationOn),
//        CardItem("Search", Icons.Default.Search),
//        CardItem("Home", Icons.Default.Home),
//        CardItem("Settings", Icons.Default.Settings)
//    )
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(top = 100.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Somon.tj",
//            fontSize = 34.sp,
//            modifier = Modifier.padding(bottom = 24.dp)
//        )
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp),
//            horizontalArrangement = Arrangement.Center
//        ){
//            Card(
//                modifier = Modifier
//                    .clickable { }
//                    .height(50.dp)
//                    .width(200.dp),
//                shape = RoundedCornerShape(8.dp),
//                colors = CardDefaults.cardColors(containerColor = Color(0xFFEFEFEF))
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(start = 8.dp),
//                    horizontalArrangement = Arrangement.Start,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Search,
//                        contentDescription = "Search"
//                    )
//                    Spacer(modifier = Modifier.width(8.dp))
//                    Text("65 916 объявлений")
//                }
//            }
//            Spacer(modifier = Modifier.width(8.dp))
//
//            Card(
//                modifier = Modifier
//                    .clickable { }
//                    .height(50.dp)
//                    .width(200.dp),
//                shape = RoundedCornerShape(8.dp),
//                colors = CardDefaults.cardColors(containerColor = Color(0xFFEFEFEF))
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(8.dp),
//                    horizontalArrangement = Arrangement.Start,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.LocationOn,
//                        contentDescription = "Location"
//                    )
//                    Spacer(modifier = Modifier.width(8.dp))
//                    Text("Khujand")
//                }
//            }
//        }
//        Spacer(modifier = Modifier.height(10.dp))
//
//        val scrollState = rememberScrollState()
//        Row(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(horizontal = 8.dp)
//                .horizontalScroll(scrollState),
//            horizontalArrangement = Arrangement.spacedBy(8.dp)
//        ) {
//            cardItems.forEach{ item ->
//                Card(
//                    modifier = Modifier
//                        .clickable { }
//                        .height(100.dp)
//                        .width(100.dp),
//                    shape = RoundedCornerShape(8.dp),
//                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEFEFEF))
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(8.dp),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Icon(
//                            imageVector = item.icon,
//                            contentDescription = "Closes"
//                        )
//                        Spacer(modifier = Modifier.width(8.dp))
//                        Text(item.name)
//                    }
//                }
//            }
//        }
//    }
//}

