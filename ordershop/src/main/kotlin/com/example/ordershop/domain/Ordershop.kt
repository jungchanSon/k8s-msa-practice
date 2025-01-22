package com.example.ordershop.domain

import jakarta.persistence.*

@Entity
@Table(name = "ordershop")
open class Ordershop (
    orderId: Long,
    orderName: String,
    shopId: Long,
    shopName: String,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    protected set

    open var orderId = orderId
    protected set

    open var orderName = orderName
    protected set

    open var shopId = shopId
    protected set

    open var shopName = shopName
    protected set


}
