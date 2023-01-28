package com.andres.robsi.ui.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.robsi.R
import com.andres.robsi.utils.CircleMainParams

@Composable
fun RecordingButtons() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircleMain(
                circleMainParams = CircleMainParams(
                    sizeComponent = 30.dp,
                    image = R.drawable.images,
                    alphaShadowTop = 0.3f,
                    alphaShadowBottom = 0.8f,
                    alphaInnerShadow = 1f,
                    colorShadowTop = Color(0xFF03A9F4),
                    colorShadowBottom = Color(0xFF000000),
                    colorInnerShadow = Color.Black,
                    posXShadowTop = 0.dp,
                    posYShadowTop = (-5).dp,
                    posXShadowBottom = 0.dp,
                    posYShadowBottom = 5.dp,
                    posXInnerShadow = 2.dp,
                    posYInnerShadow = 3.dp,
                    blurShadowTop = 10.dp,
                    blurShadowBottom = 10.dp,
                    blurInnerShadow = 5.dp,
                    contentScale = ContentScale.Crop,
                )
            )
            Spacer(modifier = Modifier.width(12.dp))
            CircleMain(
                circleMainParams = CircleMainParams(
                    sizeComponent = 35.dp,
                    image = R.drawable.images,
                    alphaShadowTop = 0.3f,
                    alphaShadowBottom = 0.8f,
                    alphaInnerShadow = 1f,
                    colorShadowTop = Color(0xFF03A9F4),
                    colorShadowBottom = Color(0xFF000000),
                    colorInnerShadow = Color.Black,
                    posXShadowTop = 0.dp,
                    posYShadowTop = (-5).dp,
                    posXShadowBottom = 0.dp,
                    posYShadowBottom = 5.dp,
                    posXInnerShadow = 2.dp,
                    posYInnerShadow = 3.dp,
                    blurShadowTop = 10.dp,
                    blurShadowBottom = 10.dp,
                    blurInnerShadow = 5.dp,
                    contentScale = ContentScale.Crop,
                )
            )
            Spacer(modifier = Modifier.width(12.dp))
            CircleMain(
                circleMainParams = CircleMainParams(
                    sizeComponent = 30.dp,
                    image = R.drawable.images,
                    alphaShadowTop = 0.3f,
                    alphaShadowBottom = 0.8f,
                    alphaInnerShadow = 1f,
                    colorShadowTop = Color(0xFF03A9F4),
                    colorShadowBottom = Color(0xFF000000),
                    colorInnerShadow = Color.Black,
                    posXShadowTop = 0.dp,
                    posYShadowTop = (-5).dp,
                    posXShadowBottom = 0.dp,
                    posYShadowBottom = 5.dp,
                    posXInnerShadow = 2.dp,
                    posYInnerShadow = 3.dp,
                    blurShadowTop = 10.dp,
                    blurShadowBottom = 10.dp,
                    blurInnerShadow = 5.dp,
                    contentScale = ContentScale.Crop,
                )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Recording",
            style = MaterialTheme.typography.overline.copy(
                fontSize = 8.sp,
                color = Color.White.copy(alpha = 0.6f)
            )
        )
    }
}