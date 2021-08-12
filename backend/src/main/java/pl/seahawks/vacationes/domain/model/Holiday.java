package pl.seahawks.vacationes.domain.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Builder
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carrierName;
    @ManyToOne
    private Location destination;
    @OneToOne
    private Flight flight;
    private BigDecimal price;
    private Integer duration;
    private LocalDate start;
    private LocalDate end;
    private String url;
    private String pictureUrl;
    @Enumerated(EnumType.STRING)
    private OfferType offerType;
    @Enumerated(EnumType.STRING)
    private OfferPackage offerPackage;
}
