package app.SpringBoot.controllers;

import app.SpringBoot.entities.Offer;
import app.SpringBoot.services.OfferServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offer")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class OfferController {
    @Autowired
    OfferServiceInter offerServiceInter;
    @GetMapping("/getAllOffers")
    public List<Offer> getAllTours() {
        return offerServiceInter.getAllOffers();
    }


    @GetMapping("/getOfferById/{id}")
    public Offer getOfferById(@PathVariable Long id) {
        return offerServiceInter.getOfferById(id);
    }

    @PostMapping("/create")
    public Offer createOffer(@RequestBody Offer offer) {
        return offerServiceInter.createOffer(offer);
    }

    @PutMapping("/update/{id}")
    public Offer updateOffer(@RequestBody Offer offer, @PathVariable Long id){
        return offerServiceInter.updateOffer(offer,id);
    }
    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteOffer(@PathVariable Long id) {
        offerServiceInter.deleteOffer(id);
    }
}
