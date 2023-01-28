package com.andres.robsi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login() {
    val backgroundColor = listOf(Color(0xFF585858), Color(0xFF343333))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.horizontalGradient(backgroundColor)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        CircleMain(
            modifier = Modifier,
            size = 200.dp,
            alphaShadowTop = 0.3f,
            alphaShadowBottom = 0.8f,
            alphaInnerShadow = 1f,
            colorShadowTop = Color(0xFF03A9F4),
            colorShadowBottom = Color(0xFF000000),
            colorInnerShadow = Color.Black,
            image = R.drawable.bars,
            scaleImage = 0.7f,
            posXShadowTop = 0.dp,
            posYShadowTop = (-10).dp,
            posXShadowBottom = 0.dp,
            posYShadowBottom = 40.dp,
            posXInnerShadow = 2.dp,
            posYInnerShadow = 3.dp,
            blurShadowTop = 70.dp,
            blurShadowBottom = 50.dp,
            blurInnerShadow = 5.dp,
        )
    }
}

@Composable
fun CircleMain(
    modifier: Modifier,
    size: Dp,
    alphaShadowTop: Float,
    alphaShadowBottom: Float,
    alphaInnerShadow: Float,
    colorShadowTop: Color,
    colorShadowBottom: Color,
    colorInnerShadow: Color,
    image: Int,
    scaleImage: Float,
    posXShadowTop: Dp,
    posYShadowTop: Dp,
    posXShadowBottom: Dp,
    posYShadowBottom: Dp,
    posXInnerShadow: Dp,
    posYInnerShadow: Dp,
    blurShadowTop: Dp,
    blurShadowBottom: Dp,
    blurInnerShadow: Dp,
    contentDescriptionIcon: String? = null
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        //Shadow top
        Box(
            modifier = Modifier
                .size(size)
                .offset(x = posXShadowTop, y = posYShadowTop)
                .blur(radius = blurShadowTop,
                    edgeTreatment = BlurredEdgeTreatment.Unbounded)
                .clip(CircleShape)
                .background(color = colorShadowTop.copy(alpha = alphaShadowTop),
                    shape = CircleShape)
        )
        //Shadow bottom
        Box(
            modifier = Modifier
                .size(size - size * 0.2f)
                .offset(x = posXShadowBottom, y = posYShadowBottom)
                .blur(radius = blurShadowBottom,
                    edgeTreatment = BlurredEdgeTreatment.Unbounded)
                .clip(CircleShape)
                .background(color = colorShadowBottom.copy(alpha = alphaShadowBottom),
                    shape = CircleShape)
        )
        //Circle main
        Card(
            modifier = Modifier.size( size - size * 0.1f),
            elevation = 0.dp,
            shape = CircleShape,
            border = BorderStroke(6.dp, Color(0xFF424242)),
            backgroundColor = Color(0xFF343333)
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                //Inner shadow
                Box(
                    modifier = Modifier
                        .size(size)
                        .offset(x = posXInnerShadow, y = posYInnerShadow)
                        .blur(radius = blurInnerShadow,
                            edgeTreatment = BlurredEdgeTreatment.Unbounded)
                        .border(border = BorderStroke(width = 5.dp,
                            color = colorInnerShadow.copy(alpha = alphaInnerShadow)),
                            shape = CircleShape
                        )
                        .clip(CircleShape)
                )
                //Image
                Image(
                    painter = painterResource(id = image),
                    contentDescription = contentDescriptionIcon,
                    contentScale = ContentScale.Inside,
                    modifier = Modifier.scale(scaleImage)
                )
            }
        }
    }
}

@Composable
fun Header() {
    Column(
        modifier = Modifier.padding(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello my frieds, I come back!",
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
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Preview
@Composable
fun LoginPrev() {
    Login()
}