package pl.seahawks.vacationes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItakaGeneralOfferDto {

  private String nameHotel;
  private String linkToMainOferr;
  private String kindOfOferr;
  private String price;
  private String duration;
  private String ratng;
  private String linkToPhoto;
}
