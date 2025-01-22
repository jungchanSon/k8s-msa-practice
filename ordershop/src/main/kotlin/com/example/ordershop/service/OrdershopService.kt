package com.example.ordershop.service

import com.example.ordershop.domain.Ordershop
import com.example.ordershop.repository.OrdershopRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class OrdershopService (
    private val ordershopRepository : OrdershopRepository,
){

    @Transactional
    fun createOrder(order: Ordershop): Long = ordershopRepository.save(order).id

    fun findById(orderId: Long): Ordershop = ordershopRepository.findById(orderId).orElseThrow()

    fun deleteById(orderId: Long) = ordershopRepository.deleteById(orderId)

}
