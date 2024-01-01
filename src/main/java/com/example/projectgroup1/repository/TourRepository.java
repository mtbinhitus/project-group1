package com.example.projectgroup1.repository;

import com.example.projectgroup1.entity.Tour;
import com.example.projectgroup1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour,Integer> {
    Tour findById(int id);
}
