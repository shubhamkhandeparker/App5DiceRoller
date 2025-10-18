package com.shubham.app5diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
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
    //Our UI and Logic will go here
}


@Preview(showBackground = true)
@Composable
fun DicePreview(){
    App5DiceRollerTheme {
        DiceScreen()
    }
}