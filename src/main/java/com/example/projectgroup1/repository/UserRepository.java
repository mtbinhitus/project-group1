package com.example.projectgroup1.repository;

import com.example.projectgroup1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    User findById(int id);
}
