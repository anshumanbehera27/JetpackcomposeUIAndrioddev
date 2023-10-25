package com.example.materialapp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialapp3.ui.theme.MaterialApp3Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialApp3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // TODO create the Add button
                   Scaffold(
                       floatingActionButton = {
                           FloatingActionButton(onClick = { /*TODO*/ }) {
                               Icon(imageVector = Icons.Default.Add, contentDescription = null  , tint = MaterialTheme.colorScheme.onErrorContainer)

                           }
                       },
                       topBar = {
                           SmallTopAppBar(title = { Text(text = "Content App")} ,
                               colors = TopAppBarDefaults.smallTopAppBarColors(
                                   containerColor = MaterialTheme.colorScheme.surfaceVariant ,
                                   titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant)
                           )
                       },
                       ) { values ->
                       LazyColumn(contentPadding = values){
                           items(20){
                               ImageCard(
                                   title = "Bacon ipsum",
                                   description = "Bacon ipsum dolor amet pork shankle beef andouille ball tip. Meatball corned beef swine, strip steak bacon jerky doner tongue biltong pork loin drumstick sausage hamburger burgdoggen." ,
                                   modifier =  Modifier.padding(16.dp))


                           }
                           

                       }
                       
                   }
                }
            }
        }
    }
}

