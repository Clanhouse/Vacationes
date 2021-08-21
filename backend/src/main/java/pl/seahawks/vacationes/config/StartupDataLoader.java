package pl.seahawks.vacationes.config;

import lombok.AllArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.seahawks.vacationes.domain.model.*;
import pl.seahawks.vacationes.repository.FlightRepository;
import pl.seahawks.vacationes.repository.HolidayRepository;
import pl.seahawks.vacationes.repository.HotelRepository;
import pl.seahawks.vacationes.repository.LocationRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@Component
@AllArgsConstructor
public class StartupDataLoader {

    private final FlightRepository flightRepository;
    private final HolidayRepository holidayRepository;
    private final HotelRepository hotelRepository;
    private final LocationRepository locationRepository;

    @EventListener
    public void loadData(ContextRefreshedEvent event) {
        //example date
        LocalDate date1 = LocalDate.of(2021, Month.NOVEMBER, 20);
        LocalDate date2 = LocalDate.of(2021, Month.DECEMBER, 11);

        //example location
        Location location1 = Location.builder()
                .country("Poland")
                .city("Warsaw")
                .airportName("Chopin Airport")
                .district("Wlochy")
                .holidays(new ArrayList<>())
                .flights(new ArrayList<>()).build();
        Location location2 = Location.builder()
                .country("Spain")
                .city("Madrid")
                .airportName("Adolfo Suárez Madrid-Barajas Airport.")
                .holidays(new ArrayList<>())
                .flights(new ArrayList<>()).district("21").build();
        String url = "https://exampleurl.com/";
        String picture = "https://examplepicture.com/";

        //example flight
        Flight flight = Flight.builder()
                .carrierName("Lot")
                .departureDate(date1)
                .destination(location1)
                .from(location2)
                .price(BigDecimal.valueOf(2000))
                .returnDate(date2)
                .url(url)
                .build();
        Flight flight2 = Flight.builder()
                .carrierName("Ryanair")
                .departureDate(date2)
                .destination(location2)
                .from(location1)
                .price(BigDecimal.valueOf(1899))
                .returnDate(date1)
                .url(url)
                .build();

        locationRepository.save(location1);
        locationRepository.save(location2);
        flightRepository.save(flight);
        flightRepository.save(flight2);

        //Hotel
        Hotel hotel = Hotel.builder()
                .name("Mercure")
                .opinions(120)
                .rate(8D)
                .pictureUrl(picture)
                .build();
        hotelRepository.save(hotel);

        //offer package and offer type
        OfferPackage fb = OfferPackage.FB;
        OfferType type1 = OfferType.FIRST_MINUTE;
        Holiday holiday = Holiday.builder()
                .carrierName("Lot")
                .price(new BigDecimal(125.25))
                .destination(location1)
                .duration(100)
                .startDate(date1)
                .endDate(date2)
                .url(url)
                .flight(flight2)
                .offerPackage(fb)
                .offerType(type1)
                .pictureUrl(url)
                .hotel(hotel)
                .build();
        holidayRepository.save(holiday);
    }
}
