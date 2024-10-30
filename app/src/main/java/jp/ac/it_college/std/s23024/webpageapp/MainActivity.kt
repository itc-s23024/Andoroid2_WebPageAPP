package jp.ac.it_college.std.s23024.webpageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import jp.ac.it_college.std.s23024.webpageapp.ui.SecondaryTabRowScreen
import jp.ac.it_college.std.s23024.webpageapp.ui.theme.WebPageAppTheme
import jp.ac.it_college.std.s23024.webpageapp.ui.WebView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WebPageAppTheme {
                SecondaryTabRowScreen()
            }
        }
    }
}
