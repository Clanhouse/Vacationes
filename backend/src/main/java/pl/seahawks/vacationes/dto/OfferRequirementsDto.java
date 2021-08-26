package pl.seahawks.vacationes.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import org.springframework.lang.Nullable;

@Data
@Builder
@AllArgsConstructor
public class OfferRequirementsDto {

  @Nullable
  private String packageType;
  @NotNull
  private String adults;
  @Nullable
  private String childrenAge;
  @NotNull
  private String dateFrom;
  @NotNull
  private String dateTo;
  @Nullable
  private String food;
  @NotNull
  private String region;
}
