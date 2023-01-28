package com.andres.robsi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.andres.robsi.ui.theme.RobsiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RobsiTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Login()
                }
            }
        }
    }
}
/*

@Composable
fun Instagram() {
    val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {
        drawRoundRect(
            brush = Brush.linearGradient(colors = instaColors),
            cornerRadius = CornerRadius(x = 60f, y = 60f),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            center = Offset(x = size.width * 0.80f, y = size.height * 0.20f),
            radius = 13f
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            center = Offset(x = size.width * 0.5f, y = size.height * 0.5f),
            radius = 45f,
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
    }
}

@Composable
fun Facebook() {
    val assetManager = LocalContext.current.assets
    val paint = Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 200f
        color = Color.White.toArgb()
        typeface = Typeface.createFromAsset(assetManager, "FACEBOLF.OTF")
    }
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {
        drawRoundRect(
            color = Color(0xFF1776d1),
            cornerRadius = CornerRadius(20f, 20f)
        )
        drawContext.canvas.nativeCanvas.drawText("f", center.x + 25, center.y + 90, paint)
    }
}

@Composable
fun Messenger() {
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {
        val colors = listOf(Color(0xFF02b8f9), Color(0xFF0277fe))
        val width = size.width
        val height = size.height
        val trianglePath = Path().let { path ->
            path.moveTo(x = width * 0.20f, y = height * 0.77f)
            path.lineTo(x = width * 0.20f, y = height * 0.95f)
            path.lineTo(x = width * 0.37f, y = height * 0.86f)
            path.close()
            path
        }
        val electricPath = Path().let { path ->
            path.moveTo(x = width * 0.20f, y = height * 0.60f)
            path.lineTo(x = width * 0.45f, y = height * 0.35f)
            path.lineTo(x = width * 0.56f, y = height * 0.46f)
            path.lineTo(x = width * 0.78f, y = height * 0.35f)
            path.lineTo(x = width * 0.54f, y = height * 0.60f)
            path.lineTo(x = width * 0.43f, y = height * 0.45f)
            path.close()
            path
        }
        drawOval(
            brush = Brush.verticalGradient(colors = colors),
            size = Size(width = width, height = height * 0.95f)
        )
        drawPath(
            path = trianglePath,
            brush = Brush.verticalGradient(colors = colors),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
        drawPath(path = electricPath, color = Color.White)
    }
}

@Composable
fun Photos() {
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {
        val width = size.width
        val height = size.height
        drawArc(
            color = Color(0xFF30a952),
            startAngle = 180f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(x = width * 0f, y = height * 0.25f),
            size = Size(width = width * 0.5f, height = height * 0.5f)
        )
        drawArc(
            color = Color(0xFFf04231),
            startAngle = 270f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(x = width * 0.25f, y = height * 0f),
            size = Size(width = width * 0.5f, height = height * 0.5f)
        )
        drawArc(
            color = Color(0xFF4385f7),
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(x = width * 0.5f, y = height * 0.25f),
            size = Size(width = width * 0.5f, height = height * 0.5f)
        )
        drawArc(
            color = Color(0xFFffbf00),
            startAngle = 90f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(x = width * 0.25f, y = height * 0.5f),
            size = Size(width = width * 0.5f, height = height * 0.5f)
        )
    }
}

@Composable
fun BezierCurves() {
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {
        val backgroundColor = listOf(Color(0xFF2078EE), Color(0xFF74E6FE))
        val sunColor = listOf(Color(0xFFFFC200), Color(0xFFFFE100))
        val width = size.width
        val height = size.height
        val path = Path().apply {
            moveTo(
                x = width.times(0.76f),
                y = height.times(0.72f)
            )
            cubicTo(
                x1 = width.times(other = 1f),
                y1 = height.times(other = 0.72f),
                x2 = width.times(other = 0.98f),
                y2 = height.times(other = 0.41f),
                x3 = width.times(other = 0.76f),
                y3 = height.times(other = 0.40f)
            )
            cubicTo(
                x1 = width.times(other = 0.75f),
                y1 = height.times(other = 0.21f),
                x2 = width.times(other = 0.35f),
                y2 = height.times(other = 0.21f),
                x3 = width.times(other = 0.38f),
                y3 = height.times(other = 0.50f)
            )
            cubicTo(
                x1 = width.times(other = 0.25f),
                y1 = height.times(other = 0.50f),
                x2 = width.times(other = 0.20f),
                y2 = height.times(other = 0.72f),
                x3 = width.times(other = 0.41f),
                y3 = height.times(other = 0.72f)
            )
            close()
        }
        drawRoundRect(
            brush = Brush.verticalGradient(backgroundColor),
            cornerRadius = CornerRadius(50f, 50f)
        )
        drawCircle(
            brush = Brush.verticalGradient(sunColor),
            radius = width.times(.17f),
            center = Offset(width.times(.35f), height.times(.35f))
        )
        drawPath(path = path, color = Color.White.copy(alpha = 0.90f))
    }
}

@Composable
fun BottomBar() {
    Canvas(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .padding(top = 20.dp)
            .height(60.dp)
    ) {
        val width = size.width
        val height = size.height
        drawRoundRect(
            color = Color.Yellow,
            cornerRadius = CornerRadius(x = 80f, y = 80f)
        )
        clipRect(
            right = width,
            bottom = height,
            clipOp = ClipOp.Intersect
        ) {
            drawCircle(
                color = Color.White,
                center = Offset(x = width * 0.5f, y = 0f),
                radius = 90f
            )
        }
        drawCircle(
            color = Color.Black,
            center = Offset(x = width * 0.5f, y = 0f),
            radius = 85f
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column {
        RobsiTheme {
            BottomBar()
        }
        RobsiTheme {
            BezierCurves()
        }
        RobsiTheme {
            Instagram()
        }
        RobsiTheme {
            Messenger()
        }
        RobsiTheme {
            Photos()
        }
    }
}
*/