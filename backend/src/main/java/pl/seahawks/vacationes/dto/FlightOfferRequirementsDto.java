package pl.seahawks.vacationes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightOfferRequirementsDto extends OfferRequirementsDto {
    private String from;
    private int personQty;
}
