package pl.seahawks.vacationes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfferDto {

  private String nameHotel;
  private String linkToMainOferr;
  private String kindOfOffer;
  private String price;
  private String rating;
  private String linkToPhoto;
  private Boolean isBestseller;
  private String date;
  private String destination;
  private String duration;
}
