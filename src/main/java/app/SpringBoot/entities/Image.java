package app.SpringBoot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    @Lob
    @Column(name = "picByte",columnDefinition = "LONGBLOB")  //LONGBLOB not LONGLOB
    byte [] picByte;

    @OneToOne
    @JoinTable(name="user_image_assoiation")
    private UserEntity user;
    @OneToOne
    @JoinTable(name="new_image_assoiation")
    private NewTravel newTravel;
    @OneToOne
    @JoinTable(name="destination_image_assoiation")
    private Destination destination;
    @OneToOne
    @JoinTable(name="package_image_assoiation")
    private SpecialPackage specialPackage;
}
