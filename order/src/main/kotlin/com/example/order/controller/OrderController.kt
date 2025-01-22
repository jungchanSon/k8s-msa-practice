package com.example.order.controller

import com.example.order.domain.Order
import com.example.order.service.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/order")
class OrderController (
    private val orderService: OrderService
){

    @PostMapping("/create")
    fun createOrder(
        @RequestBody request: OrderDto.request
    ): ResponseEntity<Long>  {
        println("order = ${request}")

        return ResponseEntity.ok(orderService.createOrder(Order(request.name!!)))
    }

    @GetMapping("/read/{orderId}")
    fun readOrder(
        @PathVariable("orderId") orderId: Long
    ): ResponseEntity<Order> = ResponseEntity.ok(orderService.findById(orderId))

    @DeleteMapping("/{orderId}")
    fun deleteOrder(
        @PathVariable("orderId") orderId: Long
    ) = ResponseEntity.ok(orderService.deleteById(orderId))


}

class OrderDto {
    data class request(
        val name: String?,
    )
}