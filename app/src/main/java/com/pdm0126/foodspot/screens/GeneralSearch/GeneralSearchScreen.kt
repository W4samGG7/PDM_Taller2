package com.pdm0126.foodspot.screens.GeneralSearch

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import com.pdm0126.foodspot.components.SearchCard

@Composable
fun GeneralSearchScreen(
    modifier: Modifier = Modifier,
    navigateToRestaurantList: () -> Unit,
    navigateToDetail:(Int) -> Unit,
    viewModel: GeneralSearchViewModel = viewModel()
) {
    val searchValue by viewModel.searchValue.collectAsState()
    val restaurantsSearched by viewModel.restaurantsSearched.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.clearSearch()
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        TopBar(
            title = "Buscar",
            showSearch = false,
            onSearch = {},
            showBack = true,
            onBack = { navigateToRestaurantList() })
        SearchBar(searchQuery = searchValue, onSearch = { search ->
            viewModel.searchOnRestaurants(search)
        })

        if(searchValue.isEmpty()) {

        } else if (restaurantsSearched.isEmpty() ) {
            Column (
                modifier = modifier.height(150.dp).width(250.dp).border(width = 2.dp,color = Color.LightGray, shape = RectangleShape),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "busqueda no encontrada",
                    tint = Color.LightGray,
                    modifier = Modifier
                        .size(50.dp)
                )
                Text(
                    text = "No se encontraron resultados",
                    color = Color.LightGray
                )
            }
        } else {
            Text(
                text = "${restaurantsSearched.size} resultados encontrados"
            )
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                contentPadding = PaddingValues(20.dp)
            ) {
                items(restaurantsSearched) { restaurantFounded ->
                    SearchCard (
                        restaurant = restaurantFounded,
                        onClick = {navigateToDetail(restaurantFounded.id)}
                    )
                }
            }
        }
    }
}