package com.andres.robsi.ui.atoms

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.andres.robsi.utils.CircleMainParams

@Composable
fun CircleMain(
    modifier: Modifier = Modifier,
    circleMainParams: CircleMainParams,
) {
    val colorBar = listOf(Color(0xFF00BCD4), Color(0xFF2196F3))
    val start = 270f
    circleMainParams.apply {
        Box(
            modifier = modifier,
            contentAlignment = Alignment.Center
        ) {
            //Shadow top
            Box(
                modifier = Modifier
                    .size(sizeComponent - sizeComponent * 0.3f)
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
                    .size(sizeComponent - sizeComponent * 0.2f)
                    .offset(x = posXShadowBottom, y = posYShadowBottom)
                    .blur(radius = blurShadowBottom,
                        edgeTreatment = BlurredEdgeTreatment.Unbounded)
                    .clip(CircleShape)
                    .background(color = colorShadowBottom.copy(alpha = alphaShadowBottom),
                        shape = CircleShape)
            )
            //Circle main
            Card(
                modifier = Modifier.size(sizeComponent - sizeComponent * 0.1f),
                elevation = 0.dp,
                shape = CircleShape,
                border = BorderStroke(borderStroke, Color(0xFF424242)),
                backgroundColor = Color(0xFF343333)
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    //Inner shadow
                    Box(
                        modifier = Modifier
                            .size(sizeComponent)
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
                        contentScale = contentScale,
                        modifier = Modifier.scale(scaleImage)
                    )
                }
            }
            if (showBar) {
                Canvas(
                    modifier = Modifier.size(175.dp)
                ) {
                    drawArc(
                        brush = Brush.radialGradient(colorBar),
                        startAngle = start,
                        sweepAngle = 60f,
                        useCenter = false,
                        topLeft = Offset(0f, 0f),
                        size = Size(width = size.width, height = size.height),
                        style = Stroke(width = 20f, cap = StrokeCap.Square),
                    )
                }
            }
        }
    }
}