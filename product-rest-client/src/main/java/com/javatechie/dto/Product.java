package com.javatechie.dto;


import java.math.BigDecimal;


public record Product(
        Long id,
        String name,
        String description,
        BigDecimal price,
        String category
) {
}