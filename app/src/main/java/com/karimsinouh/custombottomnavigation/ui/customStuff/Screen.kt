package com.karimsinouh.custombottomnavigation.ui.customStuff

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val id:String,
    val title:String,
    val icon:ImageVector,
){



    object Home:Screen("home","Home",Icons.Outlined.Home)
    object Search:Screen("seacrh","Search",Icons.Outlined.Search)
    object Profile:Screen("profile","Profile",Icons.Outlined.Person)
    object Settings:Screen("settings","Settings",Icons.Outlined.Settings)

    object Items{
        val list= listOf(
            Home,Search,Profile,Settings
        )
    }

}