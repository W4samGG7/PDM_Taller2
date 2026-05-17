package com.pdm0126.foodspot.screens.GeneralSearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GeneralSearchViewModel : ViewModel(){

    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()

    private val _restaurantsSearched = MutableStateFlow<List<Restaurant>>(emptyList())

    val restaurantsSearched = _restaurantsSearched.asStateFlow()

    private val _searchValue = MutableStateFlow("")

    val searchValue = _searchValue.asStateFlow()

    private var restaurantsList: List<Restaurant> = emptyList()

    init {
        loadSearchedRestaurants()
    }

    private fun loadSearchedRestaurants(){
        viewModelScope.launch {
            restaurantsList= restaurantRepository.getRestaurant()
        }
    }

    fun searchOnRestaurants(
        search: String
    ){
        _searchValue.value = search


        _restaurantsSearched.value = restaurantsList.filter { restaurant ->

            val searchInDishes = restaurant.menu.any{ dish ->
                dish.name.contains(search, ignoreCase = true)
            }

            val searchInRestaurants = restaurant.name.contains( search, ignoreCase = true )

            searchInDishes || searchInRestaurants
        }
    }

    fun clearSearch(){
        _searchValue.value = ""
        _restaurantsSearched.value = emptyList()
    }

}