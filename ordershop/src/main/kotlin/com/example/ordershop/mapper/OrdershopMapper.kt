package com.example.ordershop.mapper

import com.example.ordershop.controller.dto.CreateOrderShop
import com.example.ordershop.feignclient.dto.OrderFeignDto
import com.example.ordershop.feignclient.dto.ShopFeignDto

fun CreateOrderShop.Order.toFeignDto(
): OrderFeignDto.Request =
    OrderFeignDto.Request(
        name = this.name,
    )

fun CreateOrderShop.Shop.toFeignDto(
): ShopFeignDto.Request =
    ShopFeignDto.Request(
        name = this.name,
    )