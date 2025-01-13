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
public class SpecialPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "special_package_tour",
            joinColumns = @JoinColumn(name = "special_package_id"),
            inverseJoinColumns = @JoinColumn(name = "tour_id")
    )
    private Set<Tour> tours = new HashSet<>();
    @JsonIgnore
    @OneToOne(mappedBy = "specialPackage")
    private  Image packageImage;
}
