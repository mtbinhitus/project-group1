package com.example.projectgroup1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "tour_guide")
public class TourGuide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public TourGuide(User user, Tour tour) {
        this.user = user;
        this.tour = tour;
    }

    public TourGuide(Long userId, Long tourId) {
        this.user = new User();
        this.user.setId(userId);

        this.tour = new Tour();
        this.tour.setId(tourId);
    }

    public TourGuide() {
    }

    public void setId(Long id) {
        this.id = id;
    }

}
