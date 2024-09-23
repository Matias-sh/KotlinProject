import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

import moe.tlaster.precompose.PreComposeApp

@Composable
@Preview
fun App() {
    PreComposeApp {
        AppTheme {

            val colors = getColorsTheme()

            Column(modifier = Modifier.fillMaxSize()) {
                Text("Bienvenidos")
                Text("Curso de Kotlin Multiplataforma con Compose")
            }
        }
    }
}