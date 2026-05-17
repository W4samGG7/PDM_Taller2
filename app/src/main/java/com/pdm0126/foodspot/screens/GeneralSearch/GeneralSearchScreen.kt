package com.pdm0126.foodspot.screens.GeneralSearch

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.components.SearchBar
import com.pdm0126.foodspot.components.TopBar
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import com.pdm0126.foodspot.components.RestaurantCard

@Composable
fun GeneralSearchScreen(
    modifier: Modifier = Modifier,
    navigateToRestaurantList:() -> Unit,
    viewModel: GeneralSearchViewModel = viewModel()
){
    LaunchedEffect(Unit) {
        viewModel.clearSearch()
    }

    val searchValue by viewModel.searchValue.collectAsState()
    val restaurantsSearched by viewModel.restaurantsSearched.collectAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TopBar(title = "Buscar", showSearch = false, onSearch = {}, showBack = true, onBack = {navigateToRestaurantList()}  )
        SearchBar(searchQuery = searchValue, onSearch = { search ->
            viewModel.searchOnRestaurants(search)})
        Text(
            text = "${restaurantsSearched.size} resultados encontrados"
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            contentPadding = PaddingValues(20.dp)
        ) {
            items(restaurantsSearched){ restaurantFounded ->
                RestaurantCard(
                    restaurant = restaurantFounded
                )
            }
        }
    }
}