package inheritance;

public class Restaurant {
    private String name;
    private int rating;
    private int priceCategory;

    public Restaurant(String name, int rating, int priceCategory) {
        this.name = name;
        this.rating = rating;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return String.format("A restaurant named %s, with %d stars and is in %d price category", this.name, this.rating, this.priceCategory);
    }
}
