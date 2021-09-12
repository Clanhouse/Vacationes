package pl.seahawks.vacationes.provider;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.seahawks.vacationes.domain.Provider;
import pl.seahawks.vacationes.domain.flight.FlightDto;
import pl.seahawks.vacationes.domain.flight.TravelPlanetFlightProvider;

import java.util.List;
@SpringBootTest(properties = { "travelPlanet.baseUrl=https://www.travelplanet.pl/czartery/" })
class TravelPlanetFlightProviderTest {

    Provider travelPlanetFlightProvider;
    String baseUrl = "https://www.travelplanet.pl/czartery/";

    @Test
    public void shouldReturnNotEmptyList() {
        travelPlanetFlightProvider = new TravelPlanetFlightProvider(baseUrl);
        List<FlightDto> list = travelPlanetFlightProvider.getTopOfferList();
        Assertions.assertThat(list).isNotEmpty();
    }

}