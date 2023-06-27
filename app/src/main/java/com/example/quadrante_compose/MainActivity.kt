package com.example.quadrante_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrante_compose.ui.theme.Quadrante_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quadrante_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Dados()
                }
            }
        }
    }
}

@Composable
fun Dados() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {


        Quadrante(
            titulo = stringResource(id = R.string.text_compose),
            descricao = stringResource(id = R.string.text_descricao),
            background = Color(0xFFEADDFF),
            modifier = Modifier.weight(1f)
        )
        Quadrante(
            titulo = stringResource(id = R.string.image_compose),
            descricao = stringResource(id = R.string.image_descricao),
            background = Color(0xFFD0BCFF),
            modifier = Modifier.weight(1f)
        )
    }
        Row(Modifier.weight(1f)) {
            Quadrante(
                titulo = stringResource(id = R.string.row_compose),
                descricao = stringResource(id = R.string.row_descricao),
                background = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrante(
                titulo = stringResource(id = R.string.column_compose),
                descricao = stringResource(id = R.string.column_descricao),
                background = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun Quadrante(
    titulo: String,
    descricao: String,
    background: Color,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .background(background)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Text(
            text = titulo,
            Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
            )
        Text(text =descricao,
        textAlign=TextAlign.Justify)
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Quadrante_composeTheme {
        Dados()
    }
}