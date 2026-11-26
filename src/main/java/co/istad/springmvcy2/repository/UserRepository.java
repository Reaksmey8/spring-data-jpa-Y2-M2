package co.istad.springmvcy2.repository;

import co.istad.springmvcy2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
