package com.pdm0126.foodspot.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdm0126.foodspot.R


@Composable
fun TopBar(
    title: String,
    showSearch: Boolean,
    onSearch: () -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth().height(50.dp).border(width = 3.dp, color = Color.Black, shape = RectangleShape).padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        if(showSearch){
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Boton de busqueda",
                tint = colorResource(R.color.purple_search),
                modifier = Modifier.size(35.dp).clickable(onClick = {onSearch})

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar("FoodSpot", true, {})
}