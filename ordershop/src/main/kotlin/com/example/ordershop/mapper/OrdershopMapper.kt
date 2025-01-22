package com.example.ordershop.mapper

import com.example.ordershop.controller.dto.OrdershopDto
import com.example.ordershop.domain.Ordershop

fun OrdershopDto.Request.toDomain(
): Ordershop =
    Ordershop(
        name = this.name,
    )