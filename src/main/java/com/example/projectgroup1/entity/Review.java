package com.example.projectgroup1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Getter
@Table(name ="review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="review_id")
    private Integer id;
    @Column(name = "review", nullable = false, length = 255)
    private String review;

    @Column(name = "rating",columnDefinition = "DECIMAL(2,1) DEFAULT 4.5")
    private Double rating;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDate created_at;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public Review(String review, Double rating,User user, Tour tour) {
        this.review = review;
        this.rating = rating;
        this.user=user;
        this.tour=tour;
    }

    public Review() {

    }
}
