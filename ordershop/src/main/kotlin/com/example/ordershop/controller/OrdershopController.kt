package com.example.ordershop.controller

import com.example.ordershop.controller.dto.CreateOrderShop
import com.example.ordershop.domain.Ordershop
import com.example.ordershop.feignclient.OrderClient
import com.example.ordershop.service.OrdershopService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/ordershop")
class OrdershopController (
    private val ordershopService: OrdershopService,
    private val orderClient: OrderClient,
){

    @GetMapping("/read/{orderId}")
    fun readOrder(
        @PathVariable("orderId") orderId: Long
    ): ResponseEntity<Ordershop> = ResponseEntity.ok(ordershopService.findById(orderId))

    @DeleteMapping("/{orderId}")
    fun deleteOrder(
        @PathVariable("orderId") orderId: Long
    ) = ResponseEntity.ok(ordershopService.deleteById(orderId))

    @GetMapping("/feign/{orderId}")
    fun testOrderFeign(
        @PathVariable("orderId") orderId: Long
    ) = ResponseEntity.ok(orderClient.getOrder(orderId))

    @PostMapping("/feign/both")
    fun create(
        @RequestBody request: CreateOrderShop.Request
    ) = ResponseEntity.ok(ordershopService.createBoth(
        order = request.order,
        shop = request.shop
    ))
}
