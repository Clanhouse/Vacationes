package pl.seahawks.vacationes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.seahawks.vacationes.dto.FlightDto;
import pl.seahawks.vacationes.provider.TravelPlanetFlightProvider;

import java.util.List;

@SpringBootApplication
public class VacationesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VacationesApplication.class, args);
        TravelPlanetFlightProvider provider = context.getBean(TravelPlanetFlightProvider.class);
        System.out.println("start");
        List<Object> flights = provider.getTopOfferList();
        System.out.println("end");
    }

}
