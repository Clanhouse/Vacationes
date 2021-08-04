package pl.seahawks.vacationes.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Location {
    @Id
    private Long id;
    private String country;
    private String city;
    private String district;
    private String airportName;
    @OneToMany(mappedBy = "destination")
    private List<Holiday> holidays;
    @OneToMany(mappedBy = "destination")
    private List<Flight> flights;

    public void addHoliday(Holiday holiday) {
        holidays.add(holiday);
    }

    public void removeHoliday(Holiday holiday) {
        holidays.remove(holiday);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

}
