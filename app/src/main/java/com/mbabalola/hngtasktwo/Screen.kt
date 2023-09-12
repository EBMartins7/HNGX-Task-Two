package com.mbabalola.hngtasktwo

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Edit : Screen("edit_screen")
}
