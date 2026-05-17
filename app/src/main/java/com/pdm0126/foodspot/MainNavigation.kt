package com.pdm0126.foodspot

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.GeneralSearch.GeneralSearchScreen
import com.pdm0126.foodspot.screens.RestaurantDetail.RestaurantDetailScreen
import com.pdm0126.foodspot.screens.RestaurantList.RestaurantListScreen

@Composable
fun FoodSpotApp(modifier: Modifier = Modifier){
    val backStack = rememberNavBackStack(Routes.RestaurantsList)

    NavDisplay(
        backStack = backStack,
        onBack = {backStack.removeLastOrNull()},
        entryProvider = entryProvider {
            entry<Routes.RestaurantsList>{
                RestaurantListScreen(modifier,
                    navigateToSearch = {
                        backStack.add(Routes.GeneralSearch)
                    },
                    navigateToDetail = { restaurantId ->
                        backStack.add(Routes.RestaurantDetail(restaurantId))
                    }
                )
            }
            entry<Routes.GeneralSearch>{
                GeneralSearchScreen(modifier,
                    navigateToRestaurantList = {
                        backStack.removeLastOrNull()
                    },
                    navigateToDetail = { restaurantId ->
                        backStack.add(Routes.RestaurantDetail(restaurantId))
                    })
            }
            entry<Routes.RestaurantDetail>{ key ->
                RestaurantDetailScreen(
                    modifier = modifier,
                    restaurantId = key.restaurantId,
                    navigateToRestaurantList = {
                        backStack.removeLastOrNull()
                    }
                )
            }
        }
    )
}