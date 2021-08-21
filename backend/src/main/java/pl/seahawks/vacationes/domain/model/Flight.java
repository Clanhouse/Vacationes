package pl.seahawks.vacationes.domain.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carrierName;
    @ManyToOne
    private Location from;
    @ManyToOne
    private Location destination;
    private BigDecimal price;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private String url;
}
