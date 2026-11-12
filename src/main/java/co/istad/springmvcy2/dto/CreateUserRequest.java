package co.istad.springmvcy2.dto;

import java.util.UUID;

public record CreateUserRequest(

        String name,

        String username,

        String password

) {
}
