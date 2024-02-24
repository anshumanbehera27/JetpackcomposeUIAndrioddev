package com.example.materialapp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.materialapp3.ui.theme.MaterialApp3Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MaterialTheme{
              MYApp(modifier = Modifier.fillMaxSize())

          }

        }


    }
}
@Composable
fun Mynavgation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route){
        composable(Home.route){
            Content(navController)
        }
        composable(Favoritepart.route){
            favroite(modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable
fun MYApp(modifier: Modifier = Modifier){

    var shouldShowOnbording by remember { mutableStateOf(true) }
    Surface(modifier) {
        if (shouldShowOnbording){
            Homepage(onContinueClicked = {shouldShowOnbording = false})
        }else{
           Mynavgation()
        }

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Content(navController:NavController) {

    MaterialApp3Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // TODO create the Add button
            Scaffold(
                floatingActionButton = {
                    FloatingActionButton(onClick = {
                        navController.navigate(Favoritepart.route)
                    }) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = null  ,
                            tint = MaterialTheme.colorScheme.onErrorContainer)

                    }
                },
                topBar = {
//                    TopAppBar(title = { Text(text = "Content App")} ,
//                        colors = TopAppBarDefaults.smallTopAppBarColors(
//                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
//                            titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant)
//
//                    )
                    OptionMenu()


                },
            ) { values ->
                LazyColumn(contentPadding = values){
                    items(20){
                        ImageCard(
                            title = "Energize Your Workout Routine",
                            description = "Are you ready to take your fitness journey to the next level? With our expertly crafted workouts, you'll discover the power of consistency and dedication. From high-intensity interval training to soothing yoga flows, there's something for everyone. Join us and unlock your full potential today!" ,
                            modifier =  Modifier.padding(16.dp))


                    }


                }

            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
   favroite(modifier =  Modifier.fillMaxSize())

}