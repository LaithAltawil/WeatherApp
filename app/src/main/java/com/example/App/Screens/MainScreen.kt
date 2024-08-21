package com.example.App.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.App.ui.theme.playfairDisplay

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mainmenu() {
    val LightGray = Color(0xFFdddddd)
    val DarkBlue = Color(0xff125d98)
    val LighterBlue = Color(0xFF3c8dad)
    val orange = Color(0xFFf5a962)



    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.fillMaxWidth().padding(top = 70.dp),
                colors = topAppBarColors(
                    containerColor = LighterBlue,
                    titleContentColor = orange
                ),
                title = {
                    Text(modifier=Modifier.padding(20.dp),
                        text = "Weather App",
                        fontFamily = playfairDisplay,
                        textAlign = TextAlign.Center,
                        fontWeight = Bold,
                        fontSize = 40.sp
                    )
                },

                )
        }, containerColor = LighterBlue

    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Card(modifier = Modifier.fillMaxWidth(0.8f) // Adjust the width as needed
                .padding(top=60.dp).size(300.dp),
                onClick = { /*TODO*/ },
                colors = CardDefaults.cardColors(containerColor = DarkBlue,contentColor = Color.White)
            ) {
                Column {

                }

            }




        }
    }


}