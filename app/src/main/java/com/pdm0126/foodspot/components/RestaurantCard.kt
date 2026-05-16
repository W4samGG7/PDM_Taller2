package com.pdm0126.foodspot.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun RestaurantCard(
    restaurante: Restaurant
){
    Card(
        modifier = Modifier.clickable(onClick = {
        })
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            AsyncImage(
                modifier = Modifier.size(75.dp).padding(5.dp),
                alignment = Alignment.Center,
                model = restaurante.imageUrl,
                contentDescription = "Imagen del restaurante mostrado"
            )
            Text(
                text = restaurante.name
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantCardPreview(){
    val restauranteDePrueba = Restaurant(
        id = 1,
        name = "Pizza Place",
        description = "Las mejores pizzas artesanalas de la ciudad",
        imageUrl = "https://images.unsplash.com/photo-1611915365928-565c527a0590?q=80&w=1025",
        categories = listOf("Italiana","Pizzas"),
        menu = listOf(
            Dish(
                id=1,
                name = "Pizza Margarita",
                description = "Mozzarella, albahaca y tomate fresco",
                imageUrl = "https://images.unsplash.com/photo-1265299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id=2,
                name = "Pizza Pepperoni",
                description = "Pepperoni con queso mozzarella derretido",
                imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=1176"
            )
        )
    )
    RestaurantCard(restauranteDePrueba)
}