package pl.seahawks.vacationes.domain.location;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.location.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
