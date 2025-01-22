package com.example.order.mapper

import com.example.order.controller.dto.OrderDto
import com.example.order.domain.Order

fun OrderDto.Request.toDomain(
): Order =
    Order(
        name = this.name,
    )