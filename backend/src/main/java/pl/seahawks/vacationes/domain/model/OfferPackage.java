package pl.seahawks.vacationes.domain.model;

public enum OfferPackage {
    ALL_INCLUSIVE("All inclusive"), BB("BB"), HB("HB"), FB("FB");
    private final String description;

    OfferPackage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
