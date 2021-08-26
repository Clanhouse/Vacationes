package pl.seahawks.vacationes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.springframework.lang.Nullable;

@Data
@Builder
@AllArgsConstructor
public class OfferRequirementsDto {

  @Nullable
  private String packageType;
  @Nullable
  private String adults;
  @Nullable
  private String childrenAge;
  @Nullable
  private String dateFrom;
  @Nullable
  private String food;
}
