package com.andres.robsi.ui.atoms

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TimeLapse() {
    val colorBar = listOf(Color(0xFF00BCD4), Color(0xFF2196F3))
    val widthTimeLapse = 150.dp
    val timeLapsePoint = widthTimeLapse * 0.7f
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 60.dp)
            .padding(top = 80.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(end = 20.dp),
            text = "00:00",
            style = MaterialTheme.typography.overline.copy(
                fontSize = 8.sp,
                color = Color.White.copy(alpha = 0.6f)
            )
        )
        Box(
            modifier = Modifier,
            contentAlignment = Alignment.CenterStart
        ) {
            Box(
                modifier = Modifier
                    .size(width = widthTimeLapse, height = 5.dp)
                    .background(Color(0xFF2E2E2E))
            )
            Canvas(
                modifier = Modifier.size(width = timeLapsePoint, height = 5.dp)
            ) {
                drawRect(
                    brush = Brush.horizontalGradient(colorBar),
                )
            }
        }
        Text(
            modifier = Modifier.padding(start = 20.dp),
            text = "03:56",
            style = MaterialTheme.typography.overline.copy(
                fontSize = 8.sp,
                color = Color.White.copy(alpha = 0.6f)
            )
        )
    }
}