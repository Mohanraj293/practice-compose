package com.example.composelearning

/**
 * Created by Mohanraj R on 25/03/23.
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class RowColumnAndBasicSizing : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Column {
        Text(text = "Hello")
        Text(text = "World")
      }
      Row {
        Text(text = "Hello")
        Text(text = "World")
      }

      // Modifiers--------------------------------------------------
      Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
          .fillMaxSize()
          .background(Color.Green)
      ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
      }
      Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
          .fillMaxSize()
          .background(Color.Green)
      ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
      }
      // ----------------------------------------------------------------

      // Fill max size
      Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
          .fillMaxSize(1f) //.5 is 50% of height and 50% of width
          .background(Color.Green)
      ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
      }

      // Custom width and height----------------------------------------
      Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
          .height(500.dp)
          .width(350.dp)
          .background(Color.Green)
      ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
      }
      // --------------------------------------------------------------

      Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
          .fillMaxHeight(.3f)
          .fillMaxWidth(.7f)
          .background(Color.Green)
      ) {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
      }
    }
  }
}