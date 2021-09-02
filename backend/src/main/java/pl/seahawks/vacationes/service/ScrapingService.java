package pl.seahawks.vacationes.service;

import pl.seahawks.vacationes.dto.OfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.util.List;

public interface ScrapingService {
    List<OfferDto> getItakaOffersByRequirements(OfferRequirementsDto offerRequirementsDto);
}
