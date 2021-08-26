package pl.seahawks.vacationes.service.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.seahawks.vacationes.dto.ItakaGeneralOfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;
import pl.seahawks.vacationes.providers.ItakaProvider;
import pl.seahawks.vacationes.service.ScrapingService;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class ScrapingServiceImpl implements ScrapingService {

  private final ItakaProvider itakaProvider;

  @Override
  public void getItakaOffersByRequirements(OfferRequirementsDto offerRequirementsDto) {
    try {
      List<ItakaGeneralOfferDto> itakaGeneralOffers = itakaProvider.getGeneralOffersByRequirements(offerRequirementsDto);
    } catch (IOException e) {
      e.printStackTrace(); //TODO Added new class exception
    }
  }
}
