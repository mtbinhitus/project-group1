package com.example.projectgroup1.repository;

import com.example.projectgroup1.entity.Review;
import com.example.projectgroup1.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Integer> {
    Review findById(int id);
}
