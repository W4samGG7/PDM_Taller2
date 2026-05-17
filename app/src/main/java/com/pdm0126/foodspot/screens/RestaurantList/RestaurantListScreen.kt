package com.pdm0126.foodspot.screens.RestaurantList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.foodspot.components.CategoryRestaurantBox

@Composable
fun RestaurantListScreen(
    viewModel: RestaurantListViewModel = viewModel()
){
    val categories by viewModel.categories.collectAsState()
    val restaurantsByCategory by viewModel.restaurantsByCategory.collectAsState()

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(15.dp),
        contentPadding = PaddingValues(20.dp)
    ) {
        items(categories){ category ->
            CategoryRestaurantBox(
                category  = category,
                filteredRestaurants = restaurantsByCategory[category] ?: emptyList()
            )
        }
    }
}