package com.example.shop.mapper

import com.example.shop.controller.dto.ShopDto
import com.example.shop.domain.Shop

fun ShopDto.Request.toDomain(
): Shop =
    Shop(
        name = this.name,
    )