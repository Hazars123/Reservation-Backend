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
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private String password;

@ManyToMany()
    @JoinTable(name="userrole", joinColumns = @JoinColumn (name="id"),inverseJoinColumns  =@JoinColumn(name ="idrole" ))
private Set<Role> role =new HashSet<>();


    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private  Image userImage;
    @OneToMany(mappedBy = "user")
    private Set<Booking> bookings = new HashSet<>();
    @OneToMany(mappedBy = "user")
    private Set<Review> reviews = new HashSet<>();

}
