package com.yara.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yara.ai.about.AboutSectionView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(colorScheme = darkColorScheme(background = Color(0xFF07080D))) {
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF07080D)) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var tabIndex by remember { mutableIntStateOf(0) }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Yara AI v12 Ultimate", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text("Owner: HASHIM (@hashim_m4x)", fontSize = 14.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(12.dp))
        TabRow(selectedTabIndex = tabIndex) {
            Tab(selected = tabIndex == 0, onClick = { tabIndex = 0 }) { Text("Chat", modifier = Modifier.padding(12.dp)) }
            Tab(selected = tabIndex == 1, onClick = { tabIndex = 1 }) { Text("Settings", modifier = Modifier.padding(12.dp)) }
            Tab(selected = tabIndex == 2, onClick = { tabIndex = 2 }) { Text("About", modifier = Modifier.padding(12.dp)) }
        }
        Spacer(modifier = Modifier.height(16.dp))
        when (tabIndex) {
            0 -> Text("Yara AI v12 Girlfriend & Data Analytics Brain Ready for Hashim!", color = Color.White, fontSize = 18.sp)
            1 -> Text("Multi-API Cluster, Offline Brain & Emotion Settings", color = Color.White, fontSize = 18.sp)
            2 -> AboutSectionView()
        }
    }
}
