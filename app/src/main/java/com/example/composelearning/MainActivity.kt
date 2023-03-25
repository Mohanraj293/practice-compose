package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val columnWidth = 300.dp
      Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
      ) {
        Column(
          modifier = Modifier
            .width(columnWidth)
            .border(1.dp, Color.Gray)
            .background(color = Color.Green)
        ) {
          Text(
            text = "requiredWidth = parent - 50",
            modifier = Modifier
              .requiredWidth(columnWidth - 50.dp)
              .background(Color.LightGray)
          )
          Text(
            text = "requiredWidth = parent + 50",
            modifier = Modifier
              .requiredWidth(columnWidth + 50.dp)
              .background(Color.LightGray)
          )
          Text(
            text = "width = parent - 50",
            modifier = Modifier
              .width(columnWidth - 50.dp)
              .background(Color.LightGray),
          )
          Text(
            text = "width = parent + 50",
            modifier = Modifier
              .width(columnWidth + 50.dp)
              .background(Color.LightGray)
          )
        }
      }
    }
  }
}