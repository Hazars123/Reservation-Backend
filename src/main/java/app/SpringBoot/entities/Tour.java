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
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @OneToMany(mappedBy = "tour")
    private Set<Offer> offers = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "tour_destination",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "destination_id")
    )
    private Set<Destination> destinations = new HashSet<>();
    @OneToMany(mappedBy = "tour")
    private Set<Review> reviews = new HashSet<>();
    @ManyToMany(mappedBy = "tours")
    private Set<Booking> bookings = new HashSet<>();
    @ManyToMany(mappedBy = "tours")
    private Set<SpecialPackage> specialPackages = new HashSet<>();

}
