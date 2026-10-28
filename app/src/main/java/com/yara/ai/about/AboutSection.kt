package com.yara.ai.about

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutSectionView() {
    val owner = OwnerInfo()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        Text("About Yara AI v12", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFF3B5C))
        Spacer(modifier = Modifier.height(8.dp))
        Text("Owner Name: ${owner.name}", fontSize = 16.sp, color = Color.White)
        Text("Instagram: ${owner.instagramId}", fontSize = 16.sp, color = Color.Cyan)
        Text("Version: ${owner.version}", fontSize = 14.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(16.dp))
        Text("All Next-Gen Features & Capabilities:", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(8.dp))
        FeatureRegistry.fullCapabilities.forEach { cap ->
            Text("• $cap", fontSize = 14.sp, color = Color.LightGray, modifier = Modifier.padding(vertical = 4.dp))
        }
    }
}
