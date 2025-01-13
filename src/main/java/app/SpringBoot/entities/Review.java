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

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rating;
    private String comment;
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;



}
