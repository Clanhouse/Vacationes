package pl.seahawks.vacationes.domain.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<FlightDto> findAll() {
        return flightRepository.findAllByOrderByPrice().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Optional<Flight> findById(Long id) {
        return flightRepository.findById(id);
    }

    private FlightDto toDto(Flight flight) {
        return FlightDto.builder()
                .carrierName(flight.getCarrierName())
                .departureDate(flight.getDepartureDate())
                .returnDate(flight.getReturnDate())
                .destination(flight.getDestination().getCountry())
                .from(flight.getFrom().getCity())
                .price(flight.getPrice())
                .url(flight.getUrl())
                .build();
    }
}
