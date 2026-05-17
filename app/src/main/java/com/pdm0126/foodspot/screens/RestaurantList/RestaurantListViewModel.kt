package com.pdm0126.foodspot.screens.RestaurantList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantListViewModel : ViewModel(){

    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()
    private val _categories = MutableStateFlow<List<String>>(emptyList())

    val categories = _categories.asStateFlow()

    private val _restaurantsByCategory = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())

    val restaurantsByCategory = _restaurantsByCategory.asStateFlow()


    init {
        loadRestaurants()
    }

    private fun loadRestaurants(){
        viewModelScope.launch {
            val restaurantsList = restaurantRepository.getRestaurant()
            val categoriesList = restaurantRepository.getCategories()

            _categories.value = categoriesList

            _restaurantsByCategory.value = categoriesList.associateWith { category ->
                restaurantsList.filter { restaurant ->
                    category in restaurant.categories
                }
            }
        }
    }
}