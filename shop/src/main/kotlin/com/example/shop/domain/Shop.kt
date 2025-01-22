package com.example.shop.domain

import jakarta.persistence.*

@Entity
@Table(name = "shops")
class Shop (
    name: String,
){

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
        protected set

    open var name: String = name
        protected set

}