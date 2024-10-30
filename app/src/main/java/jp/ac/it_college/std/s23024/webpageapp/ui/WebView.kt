package jp.ac.it_college.std.s23024.webpageapp.ui

import android.annotation.SuppressLint
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebView(
    modifier: Modifier = Modifier,
    url: String) {
    AndroidView(
        factory = { context ->
            android.webkit.WebView(context).apply {
                webChromeClient = android.webkit.WebChromeClient()
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                loadUrl(url)
            }
        }
    )
}