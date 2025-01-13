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
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String location;

    @JsonIgnore
    @OneToOne(mappedBy = "destination")
    private  Image destImage;

    @ManyToMany(mappedBy = "destinations")
    private Set<Tour> tours = new HashSet<>();
    @ManyToMany(mappedBy = "destinations")
    private Set<Flight> flights = new HashSet<>();
}
