package com.pdm0126.foodspot.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pdm0126.foodspot.model.Restaurant
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.foodspot.model.Dish

@Composable
fun CategoryRestaurantBox(
    category: String,
    filteredRestaurants: List<Restaurant>
){
    Column(
        modifier = Modifier.height(170.dp).fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = category
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(filteredRestaurants){restaurant ->
                RestaurantCard(restaurant = restaurant)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CategoryRestaurantBoxPreview(){
    val filterRestaurant = listOf(
        Restaurant(
            id = 1,
            name = "Pizza Place",
            description = "Las mejores pizzas artesanales de la ciudad",
            imageUrl = "https://images.unsplash.com/photo-1611915365928-565c527a0590?q=80&w=1025",
            categories = listOf("Italiana", "Pizzas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Pizza Margarita",
                    description = "Mozzarella, albahaca y tomate fresco",
                    imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?q=80&w=1170"
                ),
                Dish(
                    id = 2,
                    name = "Pizza Pepperoni",
                    description = "Pepperoni con queso mozzarella derretido",
                    imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=1176"
                )
            )
        ),
                Restaurant(
                id = 2,
        name = "Burger House",
        description = "Hamburguesas gourmet al carbón con ingredientes locales",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=1255",
        categories = listOf("Hamburguesas", "Rápida","italiana"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Classic Clásica",
                description = "Carne de res, queso cheddar, lechuga y salsa secreta",
                imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&w=1130"
            ),
            Dish(
                id = 4,
                name = "Bacon Cheese BBQ",
                description = "Doble tocino crujiente, aros de cebolla y salsa BBQ",
                imageUrl = "https://images.unsplash.com/photo-1594212699903-ec8a3eca50f5?q=80&w=1171"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Trattoria Bella",
        description = "Pastas frescas hechas a mano con recetas de la abuela",
        imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?q=80&w=1074",
        categories = listOf("Italiana", "Saludable"),
        menu = listOf(
            Dish(
                id = 5,
                name = "Fettuccine Alfredo",
                description = "Pasta cremosa con mantequilla, parmesano y pollo grillé",
                imageUrl = "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?q=80&w=1170"
            ),
            Dish(
                id = 6,
                name = "Lasagna de Carne",
                description = "Capas de pasta rellenas de boloñesa casera y gratín de quesos",
                imageUrl = "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?q=80&w=1074"
            )
        )
    ),
    )
    CategoryRestaurantBox("Italiana", filterRestaurant)

}
