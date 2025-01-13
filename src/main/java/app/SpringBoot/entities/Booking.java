package app.SpringBoot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date bookingDate;
    private String status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToMany
    @JoinTable(
            name = "booking_tour",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "tour_id")
    )
    private Set<Tour> tours = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "booking_hotel",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "hotel_id")
    )
    private Set<Hotel> hotels =new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "booking_flight",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id")
    )
    private Set<Flight> flights =new HashSet<>();

}
