package com.example.shop.controller

import com.example.shop.controller.dto.ShopDto
import com.example.shop.domain.Shop
import com.example.shop.mapper.toDomain
import com.example.shop.service.ShopService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/shop")
class ShopController (
    private val shopService: ShopService,
){

    @PostMapping("/create")
    fun createShop(
        @RequestBody request: ShopDto.Request
    ): ResponseEntity<Long> {
        println("shop = ${request}")

        return ResponseEntity.ok(shopService.createShop(
            request.toDomain()
        ))
    }

    @GetMapping("/read/{shopId}")
    fun readshop(
        @PathVariable("shopId") shopId: Long
    ): ResponseEntity<Shop> = ResponseEntity.ok(shopService.findById(shopId))

    @DeleteMapping("/{shopId}")
    fun deleteshop(
        @PathVariable("shopId") shopId: Long
    ) = ResponseEntity.ok(shopService.deleteById(shopId))
}

