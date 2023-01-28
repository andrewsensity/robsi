package com.andres.robsi.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CircleMainParams(
    val sizeComponent: Dp,
    val image: Int,
    val scaleImage: Float = 1f,
    val alphaShadowTop: Float,
    val alphaShadowBottom: Float,
    val alphaInnerShadow: Float,
    val colorShadowTop: Color,
    val colorShadowBottom: Color,
    val colorInnerShadow: Color,
    val posXShadowTop: Dp,
    val posYShadowTop: Dp,
    val posXShadowBottom: Dp,
    val posYShadowBottom: Dp,
    val posXInnerShadow: Dp,
    val posYInnerShadow: Dp,
    val blurShadowTop: Dp,
    val blurShadowBottom: Dp,
    val blurInnerShadow: Dp,
    val contentScale: ContentScale,
    val showBar: Boolean = false,
    val borderStroke: Dp = 6.dp,
    val contentDescriptionIcon: String? = null
)
