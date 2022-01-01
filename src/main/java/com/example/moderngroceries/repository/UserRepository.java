package com.example.moderngroceries.repository;

import com.example.moderngroceries.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {
  public Optional<Users> findById(Long id);
}
