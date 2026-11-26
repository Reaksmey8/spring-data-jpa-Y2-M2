package co.istad.springmvcy2.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        Boolean isActive
) {
}
