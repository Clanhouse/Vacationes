package pl.seahawks.vacationes.domain.hotel;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.hotel.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
