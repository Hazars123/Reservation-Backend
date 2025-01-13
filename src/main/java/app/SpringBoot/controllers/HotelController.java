package app.SpringBoot.controllers;

import app.SpringBoot.entities.Hotel;
import app.SpringBoot.entities.UserEntity;
import app.SpringBoot.services.HotelServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class HotelController {
    @Autowired
    HotelServiceInter hotelServiceInter;
    @GetMapping("/getAllHotels")
    public List<Hotel> getAllHotels() {
        return hotelServiceInter.getAllHotels();
    }
    @GetMapping("/getHotelById/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return hotelServiceInter.getHotelById(id);
    }
    @PostMapping("/addHotel")
    public Hotel addHotel(@RequestBody Hotel hotel ){
        return hotelServiceInter.addHotel(hotel);
    }
    @PutMapping("/updateHotel/{id}")
    public Hotel updateHotel(@RequestBody Hotel hotel, @PathVariable Long id){
        return hotelServiceInter.updateHotel(hotel,id);
    }
    // Delete tour
    @DeleteMapping("/delete/{id}")
    public void deleteHotel(@PathVariable Long id) {
        hotelServiceInter.delete(id);
    }
}
