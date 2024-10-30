package jp.ac.it_college.std.s23024.webpageapp.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SecondaryScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondaryTabRowView(
    modifier: Modifier = Modifier,
    tabs: List<String>,
    tabIndex: Int,
    onTAbChange: (Int) -> Unit = {}
    ) {
    SecondaryScrollableTabRow(
        selectedTabIndex = tabIndex,
        containerColor = MaterialTheme.colorScheme.secondaryContainer
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(text = { Text(title) },
                selected = tabIndex == index,
                onClick = { onTAbChange(index) })
        }
    }
}

@Preview
@Composable
private fun SecondaryTabRowViewPreview() {
    val tabs = listOf("おすすめ", "人気", "カテゴリ", "新着", "ランキング")
    SecondaryTabRowView(tabs = tabs, tabIndex = 0)
}