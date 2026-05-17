package com.pdm0126.foodspot.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdm0126.foodspot.model.Dish

@Composable
fun DishCard(
    dish: Dish,
    onAdd:() -> Unit
){
    Card(
        modifier = Modifier.fillMaxWidth().height(150.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            AsyncImage(
                model = dish.imageUrl,
                contentDescription = "Imagen del restaurante mostrado",
                modifier = Modifier.size(126.dp),
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f).fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Text(
                    text = dish.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(
                    text = dish.description,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    modifier = Modifier.height(35.dp),
                    onClick = {onAdd()},
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(
                        text = "+ Agregar"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DishCardPreview(){
    val dishExample = Dish(
        id = 19,
        name = "Waffle Supremo",
        description = "Waffle belga con Nutella, fresas frescas y helado de vainilla",
        imageUrl = "https://images.unsplash.com/photo-1562376502-6f769499c886?q=80&w=1073"
    )
    DishCard(dishExample,{})
}