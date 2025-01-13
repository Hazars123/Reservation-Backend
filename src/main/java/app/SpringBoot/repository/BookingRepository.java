package app.SpringBoot.repository;

import app.SpringBoot.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository  extends JpaRepository<Booking,Long> {
}
