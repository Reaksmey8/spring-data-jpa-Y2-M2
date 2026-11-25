package co.istad.springmvcy2.dto;

import java.math.BigDecimal;

public record CreateProductRequest(

        String name,
        BigDecimal price,
        String description,
        Integer quantity,
        Boolean isAvailable
) {
}
