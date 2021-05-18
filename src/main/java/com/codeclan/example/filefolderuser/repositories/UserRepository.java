package com.codeclan.example.filefolderuser.repositories;

import com.codeclan.example.filefolderuser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
