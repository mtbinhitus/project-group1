package com.example.projectgroup1.service;

import com.example.projectgroup1.entity.Tour;
import com.example.projectgroup1.entity.User;
import com.example.projectgroup1.repository.TourRepository;
import com.example.projectgroup1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourService {
    private final TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public List<Tour> getAllTour(){
        return tourRepository.findAll();
    }

    public Optional<Tour> getTour(int id){
        return Optional.ofNullable(tourRepository.findById(id));
    }
}
