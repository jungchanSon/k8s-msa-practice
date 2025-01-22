package com.example.ordershop.feignclient

import com.example.ordershop.feignclient.dto.ShopFeignDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name="shop", url = "http://localhost:8080/api/shop")
interface ShopClient {

    @GetMapping("/read/{shopId}")
    fun getShop(@PathVariable("shopId") shopId: Long): ResponseEntity<ShopFeignDto.Response>

    @PostMapping("/create")
    fun createShop(@RequestBody request: ShopFeignDto.Request): ResponseEntity<Long>
}