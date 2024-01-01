package com.example.projectgroup1.service;

import com.example.projectgroup1.entity.Review;
import com.example.projectgroup1.entity.Tour;
import com.example.projectgroup1.repository.ReviewRepository;
import com.example.projectgroup1.repository.TourRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReview(){
        return reviewRepository.findAll();
    }

    public Optional<Review> getReview(int id){
        return Optional.ofNullable(reviewRepository.findById(id));
    }

    public Boolean deleteReview(int id){
       reviewRepository.deleteById(id);
       return true;
    }
}
