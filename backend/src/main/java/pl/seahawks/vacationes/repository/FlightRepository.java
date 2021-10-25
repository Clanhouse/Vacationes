package pl.seahawks.vacationes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
