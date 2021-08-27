package pl.seahawks.vacationes.providers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.Configuration;
import pl.seahawks.vacationes.dto.ItakaGeneralOfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ItakaProvider {

  private final String BASE_URL_ITAKA = "https://www.itaka.pl";
  private final String BASE_SEARCH_URL_WITH_PARAMS =
      "https://www.itaka.pl/wyniki-wyszukiwania/wakacje/?date-from=%s&date-to=%s&adults=%s&dest-region=%s";

  public List<ItakaGeneralOfferDto> getGeneralOffersByRequirements(
      OfferRequirementsDto offerRequirementsDto) throws IOException {
    String url =
        String.format(
            BASE_SEARCH_URL_WITH_PARAMS,
            offerRequirementsDto.getDateFrom(),
            offerRequirementsDto.getDateTo(),
            offerRequirementsDto.getAdults(),
            offerRequirementsDto.getRegion());
    Document webWithGeneralOffers = Jsoup.connect(url).get();
    Elements articles = webWithGeneralOffers.getElementsByTag("article");
    List<ItakaGeneralOfferDto> listItakaGeneralOferr = new ArrayList<>();
    articles.forEach(article -> listItakaGeneralOferr.add(getDetalistOffer(article)));
    return new ArrayList<>();
  }

  private ItakaGeneralOfferDto getDetalistOffer(Element article) {
    return ItakaGeneralOfferDto.builder()
        .nameHotel(article.getElementsByClass("header_title").select("a").text())
        .linkToMainOferr(
            BASE_URL_ITAKA
                + article.getElementsByClass("header_title").select("a").first().attr("href"))
        .kindOfOffer(article.getElementsByClass("offer_food pull-right").text())
        .duration(article.getElementsByClass("header_geo-labels").select("a").text())
        .price(article.getElementsByClass("current-price_value").first().text())
        .rating(article.getElementsByClass("hotel-rank").text())
        .linkToPhoto(article.getElementsByClass("swipe-gallery_item").toString())
        .isBestseller(article.getElementsByClass("bestseller marketing-info-box").hasText())
        .build();
  }
}
