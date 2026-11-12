package co.istad.springmvcy2.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class User {

    private UUID id;

    private String name;

    private String username;

    private String password;

    private Boolean isActive;


}
