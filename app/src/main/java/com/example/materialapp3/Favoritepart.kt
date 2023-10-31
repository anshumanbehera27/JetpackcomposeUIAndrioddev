package com.example.materialapp3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.materialapp3.ui.theme.MaterialApp3Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun favroite(modifier :Modifier) {
    MaterialApp3Theme {
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.onSurfaceVariant

        ) {
            Scaffold { values ->
                LazyColumn(contentPadding = values) {
                    items(5) {
                        ImageCard(
                            title = "Bacon ipsum",
                            description = "Bacon ipsum dolor amet pork shankle beef andouille ball tip. Meatball corned beef swine, strip steak bacon jerky doner tongue biltong pork loin drumstick sausage hamburger burgdoggen.",
                            modifier = Modifier.padding(16.dp)
                        )


                    }

                }

            }
        }
    }
}

