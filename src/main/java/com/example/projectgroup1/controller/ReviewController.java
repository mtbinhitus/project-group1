package com.example.projectgroup1.controller;

import com.example.projectgroup1.entity.Review;
import com.example.projectgroup1.entity.Tour;
import com.example.projectgroup1.service.ReviewService;
import com.example.projectgroup1.service.TourService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    @ResponseBody
    public List<Review> getAllTours() {
        List<Review> list =reviewService.getAllReview();
        return list;
    }

    @GetMapping("/reviews/{id}")
    @ResponseBody
    public Optional<Review> getTour(@PathVariable int id){
        Optional<Review> list = reviewService.getReview(id);
        return ResponseEntity.ok(list).getBody();
    }

    @DeleteMapping("/reviews/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteReview(@PathVariable int id){
        reviewService.deleteReview(id);
        return "success";
    }
}
