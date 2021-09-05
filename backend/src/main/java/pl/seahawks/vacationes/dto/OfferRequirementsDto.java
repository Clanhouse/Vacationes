package pl.seahawks.vacationes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class OfferRequirementsDto {
    private String destination;
    private String fromDate;
    private String endDate;
}
