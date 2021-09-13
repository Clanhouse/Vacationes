package pl.seahawks.vacationes.providers;


import pl.seahawks.vacationes.dto.OfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.io.IOException;
import java.util.List;

public interface Provider {
    List<OfferDto> getOfferList(OfferRequirementsDto offerRequirementsDto) throws IOException;

    List<OfferDto> getTheBestRatingOffer() throws IOException;
}
