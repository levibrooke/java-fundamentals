package inheritance;

import java.util.ArrayList;

public class Shop implements Business {
    private String name;
    private String description;
    private int priceCategory;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return String.format("Shop: %s \nDescription: %s \nPrice: %d", this.name, this.description, this.priceCategory);
    }

    public String addReview(Review newReview) {

        // add review to review list
        this.reviews.add(newReview);

        // add a rating calculation

        return "Review successfully added.";
    }

    public String getName() {
        return this.name;
    }
}
