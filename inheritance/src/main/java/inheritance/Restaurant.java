package inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String name;
    private int rating;
    private int priceCategory;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return String.format("A restaurant named %s and is in %d price category", this.name, this.priceCategory);
    }

    public String addReview(Review newReview) {
        // add conditional check to see if review and restaurant belong together
        if (newReview.getRestaurant() != this.name) {
            throw new IllegalArgumentException("This review doesn't belong to this restaurant.");
        }

        this.reviews.add(newReview);

        this.rating = Math.round(this.rating + newReview.getStars() / this.reviews.size());

        return "Review successfully added.";
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public int getRating() {
        return this.rating;
    }
}
