package com.pdm0126.foodspot.screens.RestaurantDetail

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.components.TopBar
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.ui.platform.LocalContext
import com.pdm0126.foodspot.components.DishCard

@Composable
fun RestaurantDetailScreen(
    modifier: Modifier = Modifier,
    restaurantId: Int,
    navigateToRestaurantList:() -> Unit,
    viewModel: RestaurantDetailViewModel = viewModel()
){
    val restaurant by viewModel.restaurant.collectAsState()

    val context = LocalContext.current

    LaunchedEffect(restaurantId) {
        viewModel.loadRestaurantById(restaurantId)
    }

    val localRestaurant = restaurant

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        if(localRestaurant == null){
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopStart)
            {
                CircularProgressIndicator()
            }
        }else {
            TopBar(
                title = localRestaurant.name,
                showSearch = false,
                onSearch = {},
                showBack = true,
                onBack = { navigateToRestaurantList() }
            )
            Text(
                text = localRestaurant.description,
                color = Color.Gray,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center,
                fontSize = 12.sp
            )
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                contentPadding = PaddingValues(20.dp)
            ) {
                items(localRestaurant.menu) { dish ->
                    DishCard(
                        dish = dish,
                        onAdd = {
                            Toast.makeText(
                                context,
                                "${dish.name} agregado al carrito",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    )

                }
            }
        }
    }
}