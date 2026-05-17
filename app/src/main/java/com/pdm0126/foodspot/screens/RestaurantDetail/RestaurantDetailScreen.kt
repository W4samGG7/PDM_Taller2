package com.pdm0126.foodspot.screens.RestaurantDetail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.components.TopBar
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun RestaurantDetailScreen(
    modifier: Modifier = Modifier,
    restaurantId: Int,
    navigateToRestaurantList:() -> Unit,
    viewModel: RestaurantDetailViewModel = viewModel()
){
    val restaurant by viewModel.restaurant.collectAsState()

    LaunchedEffect(restaurantId) {
        viewModel.loadRestaurantById(restaurantId)
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        TopBar(
          title = "",
            showSearch = false,
            onSearch = {},
            showBack = true,
            onBack = {navigateToRestaurantList()}
        )
        Text(
            text = "",
            color = Color.Gray,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )
    }
}