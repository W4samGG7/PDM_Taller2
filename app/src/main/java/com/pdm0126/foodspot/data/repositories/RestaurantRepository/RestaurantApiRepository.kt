package com.pdm0126.foodspot.data.repositories.RestaurantRepository

import com.pdm0126.foodspot.dummy.sampleRestaurants
import com.pdm0126.foodspot.model.Restaurant

class RestaurantApiRepository: RestaurantRepository {
    override suspend fun getRestaurant(): List<Restaurant> {
        return sampleRestaurants
    }

    override suspend fun getCategories(): List<String> {
        return sampleRestaurants.flatMap { it.categories }.distinct()
    }
}