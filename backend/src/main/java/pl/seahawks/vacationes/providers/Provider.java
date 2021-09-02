package pl.seahawks.vacationes.providers;

import org.jsoup.nodes.Element;
import pl.seahawks.vacationes.dto.OfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;

import java.io.IOException;
import java.util.List;

public interface Provider {
    List<Object> getOfferList(OfferRequirementsDto offerRequirementsDto) throws IOException;
    OfferDto getDetalistOffer(Element article);
}
