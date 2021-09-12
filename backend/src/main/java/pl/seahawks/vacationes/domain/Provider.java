package pl.seahawks.vacationes.domain;



import java.util.List;

public interface Provider<T> {
    List<T> getTopOfferList();
}
