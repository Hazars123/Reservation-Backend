package app.SpringBoot.controllers;

import app.SpringBoot.entities.Tour;
import app.SpringBoot.services.TourServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tour")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class TourController {
    @Autowired
    TourServiceInter tourServiceInter;
    // Read all tours
    @GetMapping("/getAllTours")
    public List<Tour> getAllTours() {
        return tourServiceInter.getAllTours();
    }

    // Read tour by ID
    @GetMapping("/getTourById/{id}")
    public Tour getTourById(@PathVariable Long id) {
        return tourServiceInter.getTourById(id);
    }

    // Create tour
    @PostMapping("/create")
    public Tour createTour(@RequestBody Tour tour) {
        return tourServiceInter.createTour(tour);
    }

    // Update tour
  @PutMapping("/updateT/{id}")
  public Tour updateTour(@RequestBody Tour tour, @PathVariable Long id){
        return tourServiceInter.updateTour(tour,id);
  }
    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteTour(@PathVariable Long id) {
        tourServiceInter.delete(id);
    }
}
