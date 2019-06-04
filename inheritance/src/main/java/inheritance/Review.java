package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString() {
        return String.format("A review: %s \n By: %s \n Stars: %d", this.body, this.author, this.stars);
    }
}
