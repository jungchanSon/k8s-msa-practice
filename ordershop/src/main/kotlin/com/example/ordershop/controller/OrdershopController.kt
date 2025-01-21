package com.example.ordershop.controller

import com.example.ordershop.domain.Ordershop
import com.example.ordershop.service.OrdershopService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/order")
class OrderController (
    private val orderService: OrdershopService
){

    @PostMapping("/create")
    fun createOrder(
        @RequestBody request: OrderDto.request
    ): ResponseEntity<Long>  {
        println("order = ${request}")

        return ResponseEntity.ok(orderService.createOrder(Ordershop(request.name!!)))
    }

    @GetMapping("/read/{orderId}")
    fun readOrder(
        @PathVariable("orderId") orderId: Long
    ): ResponseEntity<Ordershop> = ResponseEntity.ok(orderService.findById(orderId))

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