package com.pdm0126.foodspot.screens.RestaurantDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantDetailViewModel : ViewModel(){

    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant = _restaurant.asStateFlow()

    fun loadRestaurantById(id: Int){
        viewModelScope.launch{
            _restaurant.value = restaurantRepository.getRestaurantById(id)
        }
    }
}
