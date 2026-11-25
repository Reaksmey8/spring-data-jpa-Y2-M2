package co.istad.springmvcy2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private UUID id;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(unique = true ,nullable = false, length = 12)
    private String phoneNumber;

    @Column(nullable = false)
    private Boolean isDeleted;

    @OneToOne
    private User user;

}
