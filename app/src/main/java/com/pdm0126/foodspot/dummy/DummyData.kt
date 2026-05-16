package com.pdm0126.foodspot.dummy

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant
val sampleRestaurants = listOf(
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
        categories = listOf("Hamburguesas", "Rápida"),
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
    Restaurant(
        id = 4,
        name = "Green & Fresh",
        description = "Ensaladas, wraps y platillos balanceados para tu día",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=1170",
        categories = listOf("Saludable", "Vegetariana"),
        menu = listOf(
            Dish(
                id = 7,
                name = "Ensalada César con Pollo",
                description = "Lechuga romana, croutons, pollo premium y aderezo césar",
                imageUrl = "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?q=80&w=1170"
            ),
            Dish(
                id = 8,
                name = "Wrap de Avocado & Pavo",
                description = "Tortilla integral con aguacate, pechuga de pavo y espinaca",
                imageUrl = "https://images.unsplash.com/photo-1626700051175-6518c4793f4f?q=80&w=1025"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Taco Libre",
        description = "Sabor auténtico mexicano en cada bocado",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=1080",
        categories = listOf("Rápida", "Mexicana"),
        menu = listOf(
            Dish(
                id = 9,
                name = "Tacos al Pastor (Orden de 3)",
                description = "Carne de cerdo marinada, piña, cilantro y cebolla en tortilla de maíz",
                imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=1170"
            ),
            Dish(
                id = 10,
                name = "Quesadilla Gigante",
                description = "Tortilla de harina con abundante queso fundido y carne asada",
                imageUrl = "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?q=80&w=1194"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Sweet & Cake",
        description = "Postres reconfortantes, cafetería y pastelería fina",
        imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?q=80&w=1089",
        categories = listOf("Postres", "Italiana"), // Categoría en común (Postres de origen italiano etc.)
        menu = listOf(
            Dish(
                id = 11,
                name = "Tiramisú Tradicional",
                description = "Postre frío italiano con café, bizcocho y crema de mascarpone",
                imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?q=80&w=1074"
            ),
            Dish(
                id = 12,
                name = "Cheesecake de Frutos Rojos",
                description = "Base crujiente con crema de queso horneada y mermelada natural",
                imageUrl = "https://images.unsplash.com/photo-1524351199679-46cddf530c04?q=80&w=1074"
            )
        )
    ),
    Restaurant(
        id = 7,
        name = "The Grill Station",
        description = "Cortes de carne premium al punto perfecto",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=1169",
        categories = listOf("Hamburguesas", "Carnes"),
        menu = listOf(
            Dish(
                id = 13,
                name = "Baby Back Ribs",
                description = "Costillas de cerdo bañadas en salsa barbacoa ahumada",
                imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=1169"
            ),
            Dish(
                id = 14,
                name = "Monster Burger",
                description = "Triple carne, triple queso y aderezo especial de la parrilla",
                imageUrl = "https://images.unsplash.com/photo-1586190848861-99aa4a171e90?q=80&w=1160"
            )
        )
    ),
    Restaurant(
        id = 8,
        name = "Pizzería Nápoles",
        description = "Pizzas de masa madre horneadas a la piedra",
        imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?q=80&w=1170",
        categories = listOf("Italiana", "Pizzas"),
        menu = listOf(
            Dish(
                id = 15,
                name = "Pizza Cuatro Quesos",
                description = "Mezcla perfecta de Mozzarella, Gorgonzola, Parmesano y Provolone",
                imageUrl = "https://images.unsplash.com/photo-1593560708920-61dd98c46a4e?q=80&w=1035"
            ),
            Dish(
                id = 16,
                name = "Pizza Fugazzeta",
                description = "Abundante cebolla caramelizada, orégano y queso mozzarella",
                imageUrl = "https://images.unsplash.com/photo-1628840042765-356cda07504e?q=80&w=1160"
            )
        )
    ),
    Restaurant(
        id = 9,
        name = "Veggie Delight",
        description = "Comida rápida 100% basada en plantas sin perder el sabor",
        imageUrl = "https://images.unsplash.com/photo-1498837167922-ddd27525d352?q=80&w=1170",
        categories = listOf("Vegetariana", "Hamburguesas", "Saludable"),
        menu = listOf(
            Dish(
                id = 17,
                name = "Beyond Burger",
                description = "Medallón vegetal de alta proteína, queso vegano y pan brioche",
                imageUrl = "https://images.unsplash.com/photo-1585238342024-78d387f4a707?q=80&w=1160"
            ),
            Dish(
                id = 18,
                name = "Bowls de Quinua y Falafel",
                description = "Base de quinua, vegetales asados, hummus y bolitas de falafel crujiente",
                imageUrl = "https://images.unsplash.com/photo-1540420773420-3366772f4999?q=80&w=1036"
            )
        )
    ),
    Restaurant(
        id = 10,
        name = "Choco & Crunch",
        description = "Helados artesanales, waffles y elixires de chocolate",
        imageUrl = "https://images.unsplash.com/photo-1563729784474-d77dbb933a9e?q=80&w=1034",
        categories = listOf("Postres", "Rápida"),
        menu = listOf(
            Dish(
                id = 19,
                name = "Waffle Supremo",
                description = "Waffle belga con Nutella, fresas frescas y helado de vainilla",
                imageUrl = "https://images.unsplash.com/photo-1562376502-6f769499c886?q=80&w=1073"
            ),
            Dish(
                id = 20,
                name = "Volcán de Chocolate",
                description = "Bizcocho caliente con centro líquido acompañado de helado de crema",
                imageUrl = "https://images.unsplash.com/photo-1606313564200-e75d5e30476c?q=80&w=1074"
            )
        )
    )
)