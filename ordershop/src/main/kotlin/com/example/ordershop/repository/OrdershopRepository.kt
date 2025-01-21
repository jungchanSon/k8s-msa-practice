package com.example.ordershop.repository

import com.example.ordershop.domain.Ordershop
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdershopRepository : JpaRepository<Ordershop, Long>
