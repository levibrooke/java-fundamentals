package inheritance;

import java.util.ArrayList;

public class Restaurant implements Business {
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
//        if (newReview.getBusiness() != this.name) {
//            throw new IllegalArgumentException("This review doesn't belong to this restaurant.");
//        }

        this.reviews.add(newReview);

        // rating calculation needs fixing
//        this.rating = Math.round(this.rating + newReview.getStars() / this.reviews.size());

        return "Review successfully added.";
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public int getRating() {
        return this.rating;
    }
}
