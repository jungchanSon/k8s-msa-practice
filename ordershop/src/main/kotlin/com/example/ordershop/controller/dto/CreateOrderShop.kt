package com.example.ordershop.controller.dto

class CreateOrderShop {
    data class Request(
        val order: Order,
        val shop: Shop,
    )

    data class Order(
        val name: String,
    )

    data class Shop(
        val name: String,
    )
}

