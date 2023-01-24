package io.github.arashiyama11.mojishikiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.arashiyama11.mojishikiapp.ui.theme.MojishikiAppTheme
import io.github.arashiyama11.Polynomial
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MojishikiAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Column() {
            Text(text = Polynomial("x^2+4x+3").factorization().toString())
            Text(text = Polynomial("x^2+4x+3").solve().toString())
          }
          BottomNavigationBar()
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name!")
}

@Composable
private fun BottomNavigationBar(modifier: Modifier = Modifier) {
  BottomNavigation(modifier) {
    BottomNavigationItem(
      icon = {
        Icon(
          imageVector = Icons.Default.Spa,
          contentDescription = null
        )
      },
      label = {
        Text("式の整理")
      },
      selected = true,
      onClick = {}
    )
    BottomNavigationItem(
      icon = {
        Icon(
          imageVector = Icons.Default.SafetyDivider,
          contentDescription = null
        )
      },
      label = {
        Text("因数分解")
      },
      selected = false,
      onClick = {}
    )
    BottomNavigationItem(
      icon = {
        Icon(
          imageVector = Icons.Default.Groups,
          contentDescription = null
        )
      },
      label = {
        Text("連立方程式")
      },
      selected = false,
      onClick = {}
    )
    BottomNavigationItem(
      icon = {
        Icon(
          imageVector = Icons.Default.Circle,
          contentDescription = null
        )
      },
      label = {
        Text("微分積分")
      },
      selected = false,
      onClick = {}
    )
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  MojishikiAppTheme {
    Greeting("Android")
  }
}