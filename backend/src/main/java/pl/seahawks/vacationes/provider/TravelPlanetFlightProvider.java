package pl.seahawks.vacationes.provider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.seahawks.vacationes.dto.FlightDto;
import pl.seahawks.vacationes.dto.FlightOfferRequirementsDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class TravelPlanetFlightProvider implements Provider {

    private final String baseUrl;
    private final String baseSearchUrlWithParams;
    private static final String CARRIER_NAME = "Travel Planet";
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Autowired
    public TravelPlanetFlightProvider(@Value("${travelPlanet.baseUrl}") String baseUrl,
                                      @Value("${travelPlanet.baseSearchUrlWithParams}") String baseSearchUrlWithParams) {
        this.baseUrl = baseUrl;
        this.baseSearchUrlWithParams = baseSearchUrlWithParams;
    }

    @Override
    public List<Object> getOfferListBasedOnRequirements(OfferRequirementsDto offerRequirementsDto) {
        FlightOfferRequirementsDto flightOfferRequirementsDto = (FlightOfferRequirementsDto) offerRequirementsDto;

        return null;
    }

    @Override
    public List<Object> getTopOfferList() {
        try {
            Document document = Jsoup.connect(baseUrl).get();
            return document.select("li.flight-list-item").stream()
                    .skip(1) //skip table header
                    .map(this::translateToFlightDto)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
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

    private Map<String, Integer> directionMapper() {
        return Map.ofEntries(
                Map.entry("Albania", 3269),
                Map.entry("Bułgaria", 3),
                Map.entry("Dominikana", 10),
                Map.entry("Egipt", 11),
                Map.entry("Grecja", 14),
                Map.entry("Hiszpania", 15),
                Map.entry("Kuba", 21),
                Map.entry("Macedonia", 5764),
                Map.entry("Madagarskar", 2607),
                Map.entry("Malediwy", 24),
                Map.entry("Maroko", 27),
                Map.entry("Oman", 4534),
                Map.entry("Portugalia", 34),
                Map.entry("Tajlandia", 49),
                Map.entry("Tanzania", 2989),
                Map.entry("Turcja", 39),
                Map.entry("Włochy", 44),
                Map.entry("Wyspy Zielonego przylądka", 801));
    }
}
