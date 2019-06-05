package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private Business business;

    public Review(String body, String author, int stars, Business business) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.business = business;
    }

    public String toString() {
        return String.format("A review: %s \n By: %s \n Stars: %d", this.body, this.author, this.stars);
    }

    public Business getBusiness() {
        return this.business;
    }

    public int getStars() {
        return this.stars;
    }
}
