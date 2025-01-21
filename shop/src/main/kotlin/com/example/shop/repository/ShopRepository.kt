package com.example.shop.repository

import com.example.shop.domain.Shop
import org.springframework.data.jpa.repository.JpaRepository

interface ShopRepository : JpaRepository<Shop, Long>