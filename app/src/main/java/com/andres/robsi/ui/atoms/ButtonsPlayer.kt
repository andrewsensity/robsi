package com.andres.robsi.ui.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.andres.robsi.R
import com.andres.robsi.utils.CircleMainParams

@Composable
fun ButtonsPlayer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        CircleMain(
            circleMainParams = CircleMainParams(
                sizeComponent = 60.dp,
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
                posYShadowBottom = 15.dp,
                posXInnerShadow = 2.dp,
                posYInnerShadow = 3.dp,
                blurShadowTop = 20.dp,
                blurShadowBottom = 20.dp,
                blurInnerShadow = 5.dp,
                contentScale = ContentScale.Crop,
            )
        )
        Spacer(modifier = Modifier.width(40.dp))
        CircleMain(
            circleMainParams = CircleMainParams(
                sizeComponent = 70.dp,
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
                posYShadowBottom = 15.dp,
                posXInnerShadow = 2.dp,
                posYInnerShadow = 3.dp,
                blurShadowTop = 20.dp,
                blurShadowBottom = 20.dp,
                blurInnerShadow = 5.dp,
                contentScale = ContentScale.Crop,
            )
        )
        Spacer(modifier = Modifier.width(40.dp))
        CircleMain(
            circleMainParams = CircleMainParams(
                sizeComponent = 60.dp,
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
                posYShadowBottom = 15.dp,
                posXInnerShadow = 2.dp,
                posYInnerShadow = 3.dp,
                blurShadowTop = 20.dp,
                blurShadowBottom = 20.dp,
                blurInnerShadow = 5.dp,
                contentScale = ContentScale.Crop
            )
        )
    }
}