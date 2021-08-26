package pl.seahawks.vacationes.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.seahawks.vacationes.dto.OfferRequirementsDto;
import pl.seahawks.vacationes.service.ScrapingService;

@RestController
@Slf4j
@RequestMapping(value = "/scraping")
@AllArgsConstructor
public class ScrapingController {

  private final ScrapingService scrapingService;

  @GetMapping(value = "/oferts")
  public ResponseEntity<OfferRequirementsDto> getOferts(OfferRequirementsDto offerRequirementsDto) {
    scrapingService.getItakaOffersByRequirements(offerRequirementsDto);
    return new ResponseEntity<>(offerRequirementsDto, HttpStatus.OK);
  }
}
