package pl.seahawks.vacationes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.model.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday,Long> {
}
