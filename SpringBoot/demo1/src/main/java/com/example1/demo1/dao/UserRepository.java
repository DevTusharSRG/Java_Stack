package com.example1.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example1.demo1.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
