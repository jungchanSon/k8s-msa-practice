package com.example.ordershop.service

import com.example.ordershop.controller.dto.CreateOrderShop
import com.example.ordershop.domain.Ordershop
import com.example.ordershop.feignclient.OrderClient
import com.example.ordershop.feignclient.ShopClient
import com.example.ordershop.mapper.toFeignDto
import com.example.ordershop.repository.OrdershopRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class OrdershopService(
    private val ordershopRepository: OrdershopRepository,
    private val shopClient: ShopClient,
    private val orderClient: OrderClient,
){

    @Transactional
    fun createOrder(order: Ordershop): Long = ordershopRepository.save(order).id

    fun findById(orderId: Long): Ordershop = ordershopRepository.findById(orderId).orElseThrow()

    fun deleteById(orderId: Long) = ordershopRepository.deleteById(orderId)

    fun createBoth(order: CreateOrderShop.Order, shop: CreateOrderShop.Shop): Long? {

        val createOrder = orderClient.createOrder(order.toFeignDto())
        val createShop = shopClient.createShop(shop.toFeignDto())

        val save = ordershopRepository.save(
            Ordershop(
                orderId = createOrder.body!!,
                orderName = order.name,
                shopId = createShop.body!!,
                shopName = shop.name,
            )
        )

        return save.id
    }

}
