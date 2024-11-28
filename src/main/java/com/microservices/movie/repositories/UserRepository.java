package com.microservices.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.movie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
  User findByUsername(String username);
}
