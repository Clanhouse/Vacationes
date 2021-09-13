package pl.seahawks.vacationes.service.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.seahawks.vacationes.dto.OfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;
import pl.seahawks.vacationes.providers.Provider;
import pl.seahawks.vacationes.service.ScrapingService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ScrapingServiceImpl implements ScrapingService {

  private final Provider provider;

  @Override
  public List<OfferDto> getItakaOffersByRequirements(OfferRequirementsDto offerRequirementsDto) {
    try {
      return provider.getOfferList(offerRequirementsDto);
    } catch (IOException e) {
      e.printStackTrace(); //TODO Added new class exception
    }
    return new ArrayList<>();
  }

  @Override
  public List<OfferDto> getTheBestOffer () throws IOException {
    return provider.getTheBestRatingOffer();
  }
}
