package app.SpringBoot.repository;

import app.SpringBoot.entities.NewTravel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewTravelRepository  extends JpaRepository<NewTravel,Long> {
}
