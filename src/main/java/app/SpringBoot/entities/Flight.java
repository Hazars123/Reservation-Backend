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
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightNumber;
    private String departure;
    private String arrival;
    private Double price;
    @ManyToMany(mappedBy = "flights")
    private Set<Booking> bookings = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "flight_destination",
            joinColumns = @JoinColumn(name = "flight_id"),
            inverseJoinColumns = @JoinColumn(name = "destination_id")
    )
    private Set<Destination> destinations;


}
