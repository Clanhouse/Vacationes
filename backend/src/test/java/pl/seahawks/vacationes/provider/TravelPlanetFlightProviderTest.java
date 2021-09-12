package pl.seahawks.vacationes.provider;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import pl.seahawks.vacationes.domain.Provider;
import pl.seahawks.vacationes.domain.flight.FlightDto;
import pl.seahawks.vacationes.domain.flight.TravelPlanetFlightProvider;

import java.util.List;
@SpringBootTest(properties = { "travelPlanet.baseUrl=https://www.travelplanet.pl/czartery/" })
class TravelPlanetFlightProviderTest {

    Provider travelPlanetFlightProvider;
    @Value("${travelPlanet.baseUrl}")
    String baseUrl;

    @Test
    public void shouldReturnNotEmptyList() {
        //given
        travelPlanetFlightProvider = new TravelPlanetFlightProvider(baseUrl);
        //when
        List<FlightDto> list = travelPlanetFlightProvider.getTopOfferList();
        //then
        Assertions.assertThat(list).isNotEmpty();
    }

}