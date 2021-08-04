package pl.seahawks.vacationes.domain.model;

public enum OfferType {
    LAST_MINUTE("Last minute"), FIRST_MINUTE("First minute");

    private final String description;

    OfferType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
