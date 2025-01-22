package com.example.ordershop.feignclient.dto

class ShopFeignDto {
    data class Response(
        val id: Long,
        val name: String,
    )

    data class Request(
        val name: String,
    )
}