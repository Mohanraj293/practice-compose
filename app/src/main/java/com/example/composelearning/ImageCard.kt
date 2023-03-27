package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ImageCard : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    this.setContent {
      val painter = painterResource(id = R.drawable.android_vs_ios_bg)
      val description = "Android vs iOS"
      val title = "Android Rules"
      Box(
        modifier = Modifier
          .fillMaxWidth(.5f)
          .padding(15.dp)
      ) {
        ImageCard(
          painter = painter,
          contentDescription = description,
          title = title
        )
      }
    }
  }
}

@Composable
fun ImageCard(
  painter: Painter,
  contentDescription: String,
  title: String,
  modifier: Modifier = Modifier,
) {
  Card(
    modifier = modifier.fillMaxWidth(),
    shape = RoundedCornerShape(15.dp),
    elevation = 5.dp
  ) {
    Box(modifier = Modifier.height(200.dp)) {
      Image(
        painter = painter,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop
      )
      Box(
        modifier = Modifier
          .fillMaxSize()
          .background(
            Brush.verticalGradient(
              colors = listOf(
                Color.Transparent,
                Color.Magenta
              ),
              startY = 400f
            )
          )
      ) {

      }
      Box(
        modifier = Modifier
          .fillMaxSize()
          .padding(5.dp),
        contentAlignment = Alignment.BottomStart
      ) {
        Text(
          text = title,
          style = TextStyle(
            color = Color.White,
            fontSize = 16.sp
          ),
          modifier = Modifier
            .padding(10.dp)
        )
      }
    }
  }
}