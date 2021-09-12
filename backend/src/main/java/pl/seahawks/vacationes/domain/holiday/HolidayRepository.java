package pl.seahawks.vacationes.domain.holiday;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.seahawks.vacationes.domain.holiday.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
}
