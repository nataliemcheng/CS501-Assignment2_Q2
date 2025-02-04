package com.example.assignment2_q2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment2_q2.ui.theme.Assignment2_Q2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment2_Q2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Gallery(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Gallery(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.padding(50.dp)){
        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Column (modifier = Modifier.padding(5.dp)) {
                Image(painter = painterResource(id = R.drawable.cat1), contentDescription = "Cat1", modifier = Modifier.size(150.dp))
                Text(text = "Cat 1", fontSize = 12.sp) }
            Column (modifier = Modifier.padding(5.dp)){
                Image(painter = painterResource(id = R.drawable.cat2), contentDescription = "Cat2", modifier = Modifier.size(150.dp))
                Text(text = "Cat 2", fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            Column (modifier = Modifier.padding(5.dp)) {
                Image(painter = painterResource(id = R.drawable.cat3), contentDescription = "Cat2", modifier = Modifier.size(150.dp))
                Text(text = "Cat 3", fontSize = 12.sp)
            }
            Column (modifier = Modifier.padding(5.dp)) {
                Image(painter = painterResource(id = R.drawable.cat4), contentDescription = "Cat4", modifier = Modifier.size(150.dp))
                Text(text = "Cat 4", fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            Column (modifier = Modifier.padding(5.dp)) {
                Image(painter = painterResource(id = R.drawable.cat5), contentDescription = "Cat5", modifier = Modifier.size(150.dp))
                Text(text = "Cat 5", fontSize = 12.sp)
            }
            Column (modifier = Modifier.padding(5.dp)) {
                Image(painter = painterResource(id = R.drawable.cat6), contentDescription = "Cat6", modifier = Modifier.size(150.dp))
                Text(text = "Cat 6", fontSize = 12.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment2_Q2Theme {
        Gallery()
    }
}