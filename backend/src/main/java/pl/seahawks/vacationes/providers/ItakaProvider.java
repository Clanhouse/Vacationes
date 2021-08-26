package pl.seahawks.vacationes.providers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.annotation.Configuration;
import pl.seahawks.vacationes.dto.ItakaGeneralOfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ItakaProvider {

  private final String BASE_ULR_ITAKA = "https://www.itaka.pl/";
  private final String BASE_SEARCH_URL_WITH_PARAMS =
      "https://www.itaka.pl/wyniki-wyszukiwania/wakacje/?date-from=%s&date-to=%s&adults=%s&dest-region=%s";

  public void getHomePage() throws IOException {
    Document document = Jsoup.connect(BASE_ULR_ITAKA).get();
    document.select("p").forEach(System.out::println);
  }

  public List<ItakaGeneralOfferDto> getGeneralOffersByRequirements(
      OfferRequirementsDto offerRequirementsDto) throws IOException {
    String url = String.format(BASE_SEARCH_URL_WITH_PARAMS, offerRequirementsDto.getDateFrom(),offerRequirementsDto.getDateTo(), offerRequirementsDto.getAdults(), offerRequirementsDto.getRegion());
    Document webWithGeneralOffers = Jsoup.connect(url).get();
    return new ArrayList<>();
  }
}
