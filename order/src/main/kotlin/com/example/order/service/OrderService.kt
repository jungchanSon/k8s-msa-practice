package com.example.order.service

import com.example.order.domain.Order
import com.example.order.repository.OrderRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class OrderService (
    private val orderRepository : OrderRepository,
){

    @Transactional
    fun createOrder(order: Order): Long = orderRepository.save(order).id

    fun findById(orderId: Long): Order = orderRepository.findById(orderId).orElseThrow()

    fun deleteById(orderId: Long) = orderRepository.deleteById(orderId)

}
