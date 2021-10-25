package pl.seahawks.vacationes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
