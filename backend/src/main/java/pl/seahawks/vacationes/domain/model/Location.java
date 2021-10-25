package pl.seahawks.vacationes.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Builder
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    private String district;
    private String airportName;
    @OneToMany(mappedBy = "destination",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Holiday> holidays;
    @OneToMany(mappedBy = "destination",fetch = FetchType.EAGER)
    @JsonIgnore
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
