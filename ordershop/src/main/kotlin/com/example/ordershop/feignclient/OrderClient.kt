package com.example.ordershop.feignclient

import com.example.ordershop.feignclient.dto.OrderFeignDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name="order", url = "http://localhost:8080/api/order")
interface OrderClient {

    @GetMapping("/read/{orderId}")
    fun getOrder(@PathVariable("orderId") orderId: Long): ResponseEntity<OrderFeignDto.Response>

    @PostMapping("/create")
    fun createOrder(@RequestBody request: OrderFeignDto.Request): ResponseEntity<Long>
}