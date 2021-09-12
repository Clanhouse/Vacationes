package pl.seahawks.vacationes.domain;

public class ProviderConnectionException extends RuntimeException {

    public ProviderConnectionException(String providerName) {
        super("Provider for " + providerName + " stop working");
    }
}
