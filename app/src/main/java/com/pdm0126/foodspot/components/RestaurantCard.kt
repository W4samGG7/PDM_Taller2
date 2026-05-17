package com.pdm0126.foodspot.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun RestaurantCard(
    restaurant: Restaurant
){
    Card(
        modifier = Modifier.width(120.dp).height(160.dp).clickable(onClick = {
        }),

    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                modifier = Modifier.size(90.dp),
                alignment = Alignment.Center,
                model = restaurant.imageUrl,
                contentDescription = "Imagen del restaurante mostrado"
            )
            Text(
                text = restaurant.name,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center,
                fontSize = 15.sp
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