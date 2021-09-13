package pl.seahawks.vacationes.providers;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.Configuration;
import pl.seahawks.vacationes.dto.OfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class ItakaProvider implements Provider {

  private final String BASE_URL_ITAKA = "https://www.itaka.pl";
  private final String BASE_URL_THE_BEST_OFFER = "https://www.itaka.pl/wyniki-wyszukiwania/wakacje/?review-rate=50";
  private final String BASE_SEARCH_URL_WITH_PARAMS =
      "https://www.itaka.pl/wyniki-wyszukiwania/wakacje/?date-from=%s&date-to=%s&adults=%s&dest-region=%s";

  private final WebClient webClient;

  public ItakaProvider() {
    webClient = new WebClient(BrowserVersion.CHROME);
    webClient.getOptions().setJavaScriptEnabled(false);
    webClient.getOptions().setCssEnabled(true);
    webClient.getOptions().setThrowExceptionOnScriptError(true);
    webClient.waitForBackgroundJavaScript(100000);
    webClient.setJavaScriptTimeout(100000);
    webClient.waitForBackgroundJavaScript(100000);
  }

  @Override
  public List<OfferDto> getOfferList(OfferRequirementsDto offerRequirementsDto) throws IOException {
    String url =
        String.format(
            BASE_SEARCH_URL_WITH_PARAMS,
            offerRequirementsDto.getDateFrom(),
            offerRequirementsDto.getDateTo(),
            offerRequirementsDto.getAdults(),
            offerRequirementsDto.getRegion());
    Document webWithGeneralOffers = Jsoup.connect(url).get();
    Elements articles = webWithGeneralOffers.getElementsByTag("article");
    List<OfferDto> listItakaGeneralOferr = new ArrayList<>();
    articles.forEach(
        article -> {
          try {
            listItakaGeneralOferr.add(getDetalistOffer(article));
          } catch (IOException e) {
            e.printStackTrace();
          }
        });
    return listItakaGeneralOferr;
  }

  public List<OfferDto>  getTheBestRatingOffer() throws IOException {
    List<OfferDto> theBestOfferList = new ArrayList<>();
    Document webWithTheBestOffers = Jsoup.connect(BASE_URL_THE_BEST_OFFER).get();
    Elements articles = webWithTheBestOffers.getElementsByTag("article");
    articles.forEach(
            article -> {
              try {
                theBestOfferList.add(getDetalistOffer(article));
              } catch (IOException e) {
                e.printStackTrace();
              }
            });
    return theBestOfferList;
  }

  private OfferDto getDetalistOffer(Element article) throws IOException {
    String urlToOfferDails =
            BASE_URL_ITAKA
                    + article.getElementsByClass("header_title").select("a").first().attr("href");
    return OfferDto.builder()
            .nameHotel(article.getElementsByClass("header_title").select("a").text())
            .linkToMainOferr(urlToOfferDails)
            .kindOfOffer(article.getElementsByClass("offer_food pull-right").text())
            .destination(article.getElementsByClass("header_geo-labels").select("a").text())
            .price(article.getElementsByClass("current-price_value").first().text())
            .rating(article.getElementsByClass("hotel-rank").text())
            .linkToPhoto(getDatails(urlToOfferDails, article.getElementsByClass("header_title").select("a").text()))
            .isBestseller(article.getElementsByClass("bestseller marketing-info-box").hasText())
            .date(article.getElementsByClass("offer_date pull-right").first().text())
            .duration(
                    article
                            .getElementsByClass("offer_date pull-right")
                            .first()
                            .text()
                            .split(" ")[1]
                            .replace("(", ""))
            .build();
  }

  private String getDatails(String url, String name) throws IOException {

    HtmlPage htmlPage = webClient.getPage(url);
    List<HtmlElement> hmtlUlElements =
        (List<HtmlElement>) htmlPage.getByXPath("//ul[@class='slides flex-slides']");
    DomNodeList<HtmlElement> element = hmtlUlElements.get(0).getElementsByTagName("a");
    return  element.get(0).getAttribute("href");
  }
}
