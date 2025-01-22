package com.example.order.domain

import jakarta.persistence.*

@Entity
@Table(name = "orders")
open class Order (
    name: String,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    protected set

    open var name: String = name
    protected set

}
