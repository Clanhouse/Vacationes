package pl.seahawks.vacationes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.seahawks.vacationes.domain.flight.FlightDto;
import pl.seahawks.vacationes.domain.flight.TravelPlanetFlightProvider;

import java.util.List;

@SpringBootApplication
public class VacationesApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacationesApplication.class, args);
    }

}
