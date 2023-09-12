package com.mbabalola.hngtasktwo.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mbabalola.hngtasktwo.Screen
import com.mbabalola.hngtasktwo.screens.EditScreen
import com.mbabalola.hngtasktwo.screens.HomeScreen
import com.mbabalola.hngtasktwo.viewmodel.TestViewModel

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {

    val testViewModel: TestViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController, testViewModel = testViewModel)
        }
        composable(Screen.Edit.route) {
            EditScreen(navController = navController, testViewModel = testViewModel)
        }
    }

}