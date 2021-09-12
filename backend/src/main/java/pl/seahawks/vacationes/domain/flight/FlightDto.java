package pl.seahawks.vacationes.domain.flight;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {
    private String from;
    private String destination;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private BigDecimal price;
    private String carrierName;
    private String url;
}
