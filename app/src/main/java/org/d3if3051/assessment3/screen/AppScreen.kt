package org.d3if3051.assessment3.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if3051.assessment3.R
import org.d3if3051.assessment3.ui.theme.Assessment3Theme
import org.d3if3051.assessment3.ui.theme.DarkGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(navController: NavHostController){
    Scaffold(
        topBar = {
           TopAppBar(
               navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(id = R.string.back_arrow),
                            tint = Color.White
                        )
                    }
               },
               title = { Text(
                   text = stringResource(R.string.app_name),
                   color = Color.White
               ) },
               colors = TopAppBarDefaults.topAppBarColors(DarkGreen),
           )
        },
        containerColor = Color(0xFFBDF49B)
    ){
        ScreenContent2(modifier = Modifier.padding(it))
    }
}

@Composable
fun ScreenContent2(modifier: Modifier){

}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun AppScreenPreview() {
    Assessment3Theme {
        AppScreen(rememberNavController())
    }
}