package pl.seahawks.vacationes.provider;

import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.util.List;

public interface Provider {
    List<Object> getOfferListBasedOnRequirements(OfferRequirementsDto offerRequirementsDto);

    List<Object> getTopOfferList();

}
