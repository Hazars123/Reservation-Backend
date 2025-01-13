package app.SpringBoot.controllers;

import app.SpringBoot.entities.Flight;
import app.SpringBoot.entities.Hotel;
import app.SpringBoot.services.FlightServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlightController {
    @Autowired
    FlightServiceInter flightServiceInter;
    @GetMapping("/getAllFlights")
    public List<Flight> getAllFlights() {
        return flightServiceInter.getAllFlights();
    }
    @GetMapping("/getFlightById/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightServiceInter.getFlightById(id);
    }
    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight ){
        return flightServiceInter.addFlight(flight);
    }
    @PutMapping("/updateFlight/{id}")
    public Flight updateFlight(@RequestBody Flight flight, @PathVariable Long id){
        return flightServiceInter.updateFlight(flight,id);
    }
    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightServiceInter.deleteFlight(id);
    }
}