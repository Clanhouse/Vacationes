package pl.seahawks.vacationes.domain.flight;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.seahawks.vacationes.config.notfound.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("")
    public ResponseEntity<List<FlightDto>> getFlights() {
        List<FlightDto> flights = flightService.findAll();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlight(@PathVariable Long id) {
        Optional<Flight> flightOptional = flightService.findById(id);
        if (flightOptional.isPresent()) {
            return new ResponseEntity<>(flightOptional.get(), HttpStatus.OK);
        } else {
            throw new ResourceNotFoundException();
        }
    }
}
