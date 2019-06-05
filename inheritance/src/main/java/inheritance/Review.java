package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    public String toString() {
        return String.format("A review: %s \n By: %s \n Stars: %d", this.body, this.author, this.stars);
    }

    public int getStars() {
        return this.stars;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }
}
