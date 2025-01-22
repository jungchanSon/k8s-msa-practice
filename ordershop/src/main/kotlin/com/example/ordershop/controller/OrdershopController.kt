package com.example.ordershop.controller

import com.example.ordershop.controller.dto.OrdershopDto
import com.example.ordershop.domain.Ordershop
import com.example.ordershop.mapper.toDomain
import com.example.ordershop.service.OrdershopService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/order")
class OrdershopController (
    private val ordershopService: OrdershopService,
){

    @PostMapping("/create")
    fun createOrder(
        @RequestBody request: OrdershopDto.Request
    ): ResponseEntity<Long>  {
        println("order = ${request}")

        return ResponseEntity.ok(ordershopService.createOrder(
            request.toDomain()
        ))
    }

    @GetMapping("/read/{orderId}")
    fun readOrder(
        @PathVariable("orderId") orderId: Long
    ): ResponseEntity<Ordershop> = ResponseEntity.ok(ordershopService.findById(orderId))

    @DeleteMapping("/{orderId}")
    fun deleteOrder(
        @PathVariable("orderId") orderId: Long
    ) = ResponseEntity.ok(ordershopService.deleteById(orderId))
}
