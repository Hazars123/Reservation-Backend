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
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String location;
    private Double pricePerNight;
    @ManyToMany(mappedBy = "hotels")
    private Set<Booking> bookings = new HashSet<>();
    @OneToMany(mappedBy = "hotel")
    private Set<Review> reviews =new HashSet<>();
}