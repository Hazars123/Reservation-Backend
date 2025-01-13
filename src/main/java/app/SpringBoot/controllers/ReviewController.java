package app.SpringBoot.controllers;

import app.SpringBoot.entities.Review;
import app.SpringBoot.entities.Tour;
import app.SpringBoot.services.ReviewServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ReviewController {
    @Autowired
    ReviewServiceInter reviewServiceInter;

    @GetMapping("/getAllReviews")
    public List<Review> getAllReviews() {
        return reviewServiceInter.getAllReviews();
    }

    @GetMapping("/getReviewById/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return reviewServiceInter.getReviewById(id);
    }


    @PostMapping("/addReview")
    public Review createReview(@RequestBody Review review) {
        return reviewServiceInter.createReview(review);
    }



    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewServiceInter.deleteReview(id);
    }
}
