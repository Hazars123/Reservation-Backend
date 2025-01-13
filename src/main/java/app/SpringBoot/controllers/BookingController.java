package app.SpringBoot.controllers;

import app.SpringBoot.entities.Booking;
import app.SpringBoot.entities.Hotel;
import app.SpringBoot.services.BookingServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Booking")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingController {
    @Autowired
    BookingServiceInter bookingServiceInter;
    @GetMapping("/getAllBookings")
    public List<Booking> getAllHotels() {
        return bookingServiceInter.getAllBookings();
    }
    @GetMapping("/getBookingById/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingServiceInter.getBookingById(id);
    }
    @PostMapping("/addBooking")
    public Booking addBooking(@RequestBody Booking booking ){
        return bookingServiceInter.addBooking(booking);
    }


    @DeleteMapping("/deleteB/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingServiceInter.deleteBooking(id);
    }
}
