package pl.seahawks.vacationes.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.seahawks.vacationes.dto.OfferDto;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;
import pl.seahawks.vacationes.service.ScrapingService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/scraping")
@AllArgsConstructor
public class ScrapingController {

  private final ScrapingService scrapingService;

  @GetMapping(value = "/oferts")
  public ResponseEntity<List<OfferDto>> getOffers(OfferRequirementsDto offerRequirementsDto) {
    return new ResponseEntity<List<OfferDto>>(
        scrapingService.getItakaOffersByRequirements(offerRequirementsDto), HttpStatus.OK);
  }
}
