package app.SpringBoot.controllers;
import app.SpringBoot.services.DestinationServiceInter;
import app.SpringBoot.entities.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DestinationController {

    @Autowired
    DestinationServiceInter destinationServiceInter;
    @GetMapping("/getAllD")
    public List<Destination> getAllDest() {
        return destinationServiceInter.getAllDest();
    }


    @GetMapping("/getDById/{id}")
    public Destination getDestById(@PathVariable Long id) {
        return destinationServiceInter.getDestById(id);
    }

    @PostMapping("/addDest")
    public Destination addDest(@RequestBody Destination destination) {
        return destinationServiceInter.addDest(destination);
    }

    @PutMapping("/update/{id}")
    public Destination updateDest(@RequestBody Destination destination, @PathVariable Long id){
        return destinationServiceInter.updateDest(destination,id);
    }
    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteDest(@PathVariable Long id) {
        destinationServiceInter.deleteDest(id);
    }
}
