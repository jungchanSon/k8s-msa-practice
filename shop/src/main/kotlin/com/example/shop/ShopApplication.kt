package com.example.shop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ShopApplication

fun main(args: Array<String>) {
    runApplication<ShopApplication>(*args)
}