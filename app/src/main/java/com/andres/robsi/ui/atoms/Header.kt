package com.andres.robsi.ui.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    Column(
        modifier = Modifier.padding(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello my friends, I come back!",
            style = MaterialTheme.typography.overline.copy(
                fontSize = 8.sp,
                color = Color.White.copy(alpha = 0.6f)
            )
        )
        Text(
            modifier = Modifier.padding(top = 25.dp, bottom = 8.dp),
            text = "Pathfinder",
            style = MaterialTheme.typography.h6.copy(
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = "Hear me again",
            style = MaterialTheme.typography.overline.copy(
                fontSize = 8.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )
    }
}