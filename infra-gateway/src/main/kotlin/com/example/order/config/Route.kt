package com.example.order.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.PredicateSpec
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class Route {

    @Bean
    fun cRoute(builder: RouteLocatorBuilder): RouteLocator = builder.routes()
        .route("order") {
            r: PredicateSpec ->
            r.path("/api/order/**")
                .uri("lb://ORDER")
        }
        .route("shop") {
            r: PredicateSpec ->
            r.path("/api/shop/**")
                .uri("http://localhost:8085/")
        }
        .build()
}