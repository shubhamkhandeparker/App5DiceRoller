package com.shubham.app5diceroller


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.shubham.app5diceroller.ui.theme.App5DiceRollerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App5DiceRollerTheme {
                DiceScreen()
            }
        }
    }
}

@Composable
fun DiceScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //1.The Image Composable
        Image(
            painter= painterResource(id=R.drawable.dice_1),
            contentDescription = "Dice showing a 1 "
        )
    }
}

fun column(function: () -> Unit) {}


@Preview(showBackground = true)
@Composable
fun DicePreview(){
    App5DiceRollerTheme {
        DiceScreen()
    }
}