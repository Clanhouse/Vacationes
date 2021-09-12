package pl.seahawks.vacationes.domain.flight;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.seahawks.vacationes.domain.Provider;
import pl.seahawks.vacationes.domain.ProviderConnectionException;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TravelPlanetFlightProvider implements Provider<FlightDto> {

    private final String baseUrl;
    private static final String CARRIER_NAME = "Travel Planet";
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Autowired
    public TravelPlanetFlightProvider(@Value("${travelPlanet.baseUrl}") String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public List<FlightDto> getTopOfferList() {
        try {
            Document document = Jsoup.connect(baseUrl).get();
            return document.select("li.flight-list-item").stream()
                    .skip(1) //skip table header
                    .map(this::translateToFlightDto)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ProviderConnectionException(CARRIER_NAME);
        }
    }

    private FlightDto translateToFlightDto(Element element) {
        return FlightDto.builder()
                .destination(element.select("div.fr-col-1").text())
                .from(element.select("div.fr-col-2").text())
                .departureDate(LocalDate.parse(element.select("div.fr-col-3").text(), formatter))
                .returnDate(LocalDate.parse(element.select("div.fr-col-4").text(), formatter))
                .price(new BigDecimal(element.select("div.fr-col-5").text().replace(" zł", "")))
                .url(element.select("div.fr-col-btn a").attr("data-href"))
                .carrierName(CARRIER_NAME)
                .build();
    }
}
