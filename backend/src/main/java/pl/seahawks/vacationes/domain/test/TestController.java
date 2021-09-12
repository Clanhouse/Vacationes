package pl.seahawks.vacationes.domain.test;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.seahawks.vacationes.domain.flight.Flight;
import pl.seahawks.vacationes.domain.holiday.Holiday;
import pl.seahawks.vacationes.domain.hotel.Hotel;
import pl.seahawks.vacationes.domain.location.Location;
import pl.seahawks.vacationes.domain.flight.FlightRepository;
import pl.seahawks.vacationes.domain.holiday.HolidayRepository;
import pl.seahawks.vacationes.domain.hotel.HotelRepository;
import pl.seahawks.vacationes.domain.location.LocationRepository;

import javax.transaction.Transactional;
import java.util.List;

@RequestMapping("/api/test/")
@RestController
@AllArgsConstructor
@Transactional
@Slf4j
public class TestController {

    private final FlightRepository flightRepository;
    private final HolidayRepository holidayRepository;
    private final HotelRepository hotelRepository;
    private final LocationRepository locationRepository;

    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> getFlights() {
        List<Flight> flights = flightRepository.findAll();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @GetMapping("/holidays")
    public ResponseEntity<List<Holiday>> getHolidays() {
        List<Holiday> holidays = holidayRepository.findAll();
        return new ResponseEntity<>(holidays, HttpStatus.OK);
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getLocations() {
        List<Location> locations = locationRepository.findAll();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
}
