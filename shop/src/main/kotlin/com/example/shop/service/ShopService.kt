package com.example.shop.service

import com.example.shop.domain.Shop
import com.example.shop.repository.ShopRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class ShopService (
    private val shopRepository: ShopRepository,
) {

    @Transactional
    fun createShop(shop: Shop): Long = shopRepository.save(shop).id

    fun findById(shopId: Long): Shop = shopRepository.findById(shopId).orElseThrow()

    fun deleteById(shopId: Long) = shopRepository.deleteById(shopId)

}