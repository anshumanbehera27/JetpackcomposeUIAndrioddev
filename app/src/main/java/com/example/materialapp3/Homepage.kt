package com.example.materialapp3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Homepage(
    onContinueClicked: () -> Unit,
    modifier: Modifier = Modifier)
{
    
    Column(modifier = modifier.fillMaxWidth() ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.login_image),
            contentDescription = null,

        )
        Text("Welcome to the Inshort App")

        Button( modifier = Modifier.padding(vertical = 24.dp),

            onClick = onContinueClicked
        ) {

            Text("Continue")

        }
    }
}
