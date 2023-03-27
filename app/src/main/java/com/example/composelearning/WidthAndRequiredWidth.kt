package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class WidthAndRequiredWidth : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      // val columnWidth = 300.dp
      Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
      ) {
        // Column(
        //   modifier = Modifier
        //     .width(width = columnWidth)
        //     .border(width = 2.dp, color = Color.Black)
        //     .background(color = Color.Cyan)
        //     .padding(all = 10.dp)
        // ) {
        //   Text(
        //     text = "requiredWidth = parent - 50",
        //     modifier = Modifier
        //       .requiredWidth(width = columnWidth - 50.dp)
        //       .background(Color.LightGray)
        //   )
        //   Text(
        //     text = "requiredWidth = parent + 50",
        //     modifier = Modifier
        //       .requiredWidth(width = columnWidth + 50.dp)
        //       .background(Color.LightGray)
        //   )
        //   Text(
        //     text = "width = parent - 50",
        //     modifier = Modifier
        //       .width(width = columnWidth - 50.dp)
        //       .background(color = Color.LightGray),
        //   )
        //   Text(
        //     text = "width = parent + 50",
        //     modifier = Modifier
        //       .width(width = columnWidth + 50.dp)
        //       .background(color = Color.LightGray)
        //   )
        // }
        Column(
          modifier = Modifier
            .border(1.dp, Color.Gray)
            .padding(20.dp)
        ) {
          val minWidth = 220
          val maxWidth = 300
          val widthDescriptions = arrayOf(
            WidthDescription(minWidth - 50, "min - 50"),
            WidthDescription((minWidth + maxWidth) / 2, "between min and max"),
            WidthDescription(maxWidth + 50, "max + 50")
          )

          for (widthDescription in widthDescriptions) {
            Text(
              text = "requiredWidth = ${widthDescription.description}",
              modifier = Modifier
                .border(.5.dp, Color.Red)
                .widthIn(minWidth.dp, maxWidth.dp)
                .background(Color.LightGray)
                .requiredWidth(widthDescription.width.dp)
            )
          }

          for (widthDescription in widthDescriptions) {
            Text(
              text = "width = ${widthDescription.description}",
              modifier = Modifier
                .border(.5.dp, Color.Red)
                .widthIn(minWidth.dp, maxWidth.dp)
                .background(Color.LightGray)
                .width(widthDescription.width.dp)
            )
          }
        }
      }
    }
  }
}

data class WidthDescription(
  val width: Int,
  val description: String,
)