package jp.ac.it_college.std.s23024.webpageapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import jp.ac.it_college.std.s23024.webpageapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondaryTabRowScreen(modifier: Modifier = Modifier) {
    var tabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("おすすめ", "人気", "カテゴリ", "新着", "ランキング")
    var secondIndex by remember { mutableStateOf(0) }
    Scaffold(topBar = {
      Column {
          TopAppBar(title = { Text(text = stringResource(id = R.string.secondary_title)) })
          PrimaryTabRowView(tabIndex = tabIndex,
              onTabChange = { tabIndex = it })
      }
    }) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            when (tabIndex) {
                0 -> {
                    SecondaryTabRowView(tabs = tabs,
                        tabIndex = secondIndex,
                        onTAbChange = { secondIndex = it })
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = tabs[secondIndex], fontSize = 60.sp
                        )
                    }
                }

                1 -> WebView(url = "https://developer.android.com")
                2 -> WebView(url = "https://www.google.com")
            }
        }
    }
}

@Preview
@Composable
private fun SecondaryTabRowScreenPreview() {
    SecondaryTabRowScreen()
}