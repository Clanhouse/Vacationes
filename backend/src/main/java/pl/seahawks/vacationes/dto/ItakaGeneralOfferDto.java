package pl.seahawks.vacationes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ItakaGeneralOfferDto {

  private String nameHotel;
  private String linkToMainOferr;
  private String kindOfOferr;
  private String price;
  private String duration;
  private String ratng;
  private String linkToPhoto;
}
