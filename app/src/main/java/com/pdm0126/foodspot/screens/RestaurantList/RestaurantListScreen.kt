package com.pdm0126.foodspot.screens.RestaurantList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.foodspot.components.CategoryRestaurantBox
import com.pdm0126.foodspot.components.TopBar

@Composable
fun RestaurantListScreen(modifier: Modifier = Modifier, navigateToSearch:() -> Unit,
                         viewModel: RestaurantListViewModel = viewModel()
){
    val categories by viewModel.categories.collectAsState()
    val restaurantsByCategory by viewModel.restaurantsByCategory.collectAsState()
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TopBar(title = "FoodSpot", showSearch = true, onSearch = {navigateToSearch()}, showBack = false, onBack = {})
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            contentPadding = PaddingValues(20.dp)
        ) {
            items(categories) { category ->
                CategoryRestaurantBox(
                    category = category,
                    filteredRestaurants = restaurantsByCategory[category] ?: emptyList()
                )
            }
        }
    }
}