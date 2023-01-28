package com.andres.robsi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andres.robsi.ui.atoms.*
import com.andres.robsi.utils.CircleMainParams

@Composable
fun MainScreen() {
    val backgroundColor = listOf(Color(0xFF585858), Color(0xFF343333))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.horizontalGradient(backgroundColor)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        CircleMain(
            circleMainParams = CircleMainParams(
                sizeComponent = 200.dp,
                image = R.drawable.bars,
                scaleImage = 0.7f,
                alphaShadowTop = 0.3f,
                alphaShadowBottom = 0.8f,
                alphaInnerShadow = 1f,
                colorShadowTop = Color(0xFF03A9F4),
                colorShadowBottom = Color(0xFF000000),
                colorInnerShadow = Color.Black,
                posXShadowTop = 0.dp,
                posYShadowTop = (-10).dp,
                posXShadowBottom = 0.dp,
                posYShadowBottom = 40.dp,
                posXInnerShadow = 2.dp,
                posYInnerShadow = 3.dp,
                blurShadowTop = 70.dp,
                blurShadowBottom = 50.dp,
                blurInnerShadow = 5.dp,
                contentScale = ContentScale.Inside,
                showBar = true,
                borderStroke = 6.dp
            )
        )
        TimeLapse()
        RecordingButtons()
        ButtonsPlayer()
    }
}

@Preview
@Composable
fun MainPrev() {
    MainScreen()
}