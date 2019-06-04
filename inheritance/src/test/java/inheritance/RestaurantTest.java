package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void toStringTest() {
        Restaurant classUnderTest = new Restaurant("Test Restaurant", 2);

        assertEquals("test constructor and toString method",
                "A restaurant named Test Restaurant and is in 2 price category",
                classUnderTest.toString());
    }

    @Test
    public void addReviewTest() {
        Review newReview = new Review("This is a review.", "A Reviewer", 2, "Test Restaurant");

        Restaurant newRestaurant = new Restaurant("A Restaurant", 2);

        assertEquals("test add review",
                "Review successfully added.",
                newRestaurant.addReview(newReview));
    }

    @Test
    public void checkRestaurantRating() {
        Review newReview = new Review("This is a review.", "A Reviewer", 2, "Test Restaurant");

        Review anotherReview = new Review("This is a review.", "A Reviewer", 3, "Test Restaurant");

        Restaurant newRestaurant = new Restaurant("Test Restaurant", 2);

        newRestaurant.addReview(newReview);
        newRestaurant.addReview(anotherReview);

        assertEquals(3,
                newRestaurant.getRating());
    }
}