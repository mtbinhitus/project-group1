package com.example.projectgroup1.controller;

import com.example.projectgroup1.entity.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class ViewController {
    private TourController tourController;

    public ViewController(TourController tourController) {
        this.tourController = tourController;
    }

    @GetMapping("/overview")
    public String getAllTours(Model model) {
        List<Tour> tours =tourController.getAllTours();
        model.addAttribute("tours",tours);
        return "overview";
    }

    @GetMapping("/overview/{id}")
    public String getTour(@PathVariable int id, Model model) {
        Optional<Tour> optionalTour = tourController.getTour(id);

        if (optionalTour.isPresent()) {
            Tour tour = optionalTour.get();
            model.addAttribute("tour", tour);
        } else {
            // Handle the case where the tour is not present, e.g., redirect or show an error message.
        }

        return "tour";
    }

}
