package com.pdm0126.foodspot.data.repositories.RestaurantRepository

import com.pdm0126.foodspot.model.Restaurant

interface RestaurantRepository {

    suspend fun getRestaurant(): List<Restaurant>

    suspend fun getCategories(): List<String>

    suspend fun  getRestaurantByCategory(category: String): List<Restaurant>

    suspend fun getRestaurantById(id: Int): Restaurant?
}