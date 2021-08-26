package pl.seahawks.vacationes.service;

import pl.seahawks.vacationes.dto.OfferRequirementsDto;

public interface ScrapingService {
    void getItakaOffersByRequirements(OfferRequirementsDto offerRequirementsDto);
}
