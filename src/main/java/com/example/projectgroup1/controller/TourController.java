package com.example.projectgroup1.controller;

import com.example.projectgroup1.entity.Tour;
import com.example.projectgroup1.entity.User;
import com.example.projectgroup1.service.TourService;
import com.example.projectgroup1.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TourController {
    private TourService tourService;


    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/tours")
    @ResponseBody
    public List<Tour> getAllTours() {
        List<Tour> list =tourService.getAllTour();
        return ResponseEntity.ok(list).getBody();
    }

    @GetMapping("/tours/{id}")
    @ResponseBody
    public Optional<Tour> getTour(@PathVariable int id){
        Optional<Tour> list = tourService.getTour(id);
        return list;
    }
}
